/*
  Copyright (C) 2019 Francesco Mio (frazz01mio@gmail.com)

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package paridispari;

/**
 * Questo programma ha lo scopo di,tramite i thread, analizzare i singoli numeri fino ad un valore massimo 
 * stabilendone il tipo : <strong>pari/dispari</strong>
 * 
 * @author FRANCESCO MIO
 * @see https://github.com/FrancescoMio/Progetti_JavaDoc.git
 */
public class PariDispari extends Thread{
  private int massimo;
  private boolean pari;
  private int ritardo = 500;
  
  /**
   * Il <em>costruttore</em> ha la funzione di creare un nuovo <strong>thread</strong>
   * @param finale parametro che rappresenta il valore <strong>massimo</strong> fino al quale bisogna analizzare i numeri 
   * @param pari parametro che rappresenta il thread che numeri deve analizzare: <em>pari/dispari</em>
   */
  public PariDispari (int finale, boolean pari){
    massimo   = finale;
    this.pari = pari;
  }
  /**
   * Questo metodo lancia <em>l'analizzazione</em> dei numeri tramite i <strong>thread</strong>
   * ,non ritorna nulla, stampa a video la loro esecuzione
   */
  public void run(){
    String chisono;
    chisono = Thread.currentThread().getName();
    for (int xx = 0; xx < massimo; xx++){
      if(pari){              // se è il thread che deve stampare i numeri pari 
        if(xx % 2 == 0)      // numero pari 
          System.out.println(chisono+"-pari "+xx);
      }  
      else                   // se è il thread che deve stampare i numeri dispari 
        if (xx % 2 != 0)     // numero dispari 
          System.out.println(chisono+"-dispari "+xx);
      try {Thread.sleep(ritardo);}
      catch (InterruptedException e){System.out.println(e);}
    }  
  }
  /**
   * Nel <strong>main</strong> tramite il costruttore <em>paridispari</em> vengono creati i nuovi 
   * thread e mandati in esecuzione
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args){
    if (args.length != 1){
	  System.out.println("Dovresti passare il numero intero");
	  return;
    }    
    int n = Integer.parseInt(args[0]);
    Thread TP = new PariDispari (n + 1, true);  // thread che conta i pari
    Thread TD = new PariDispari (n + 1, false); // thread che conta i dispari
    System.out.println("->Contate fino a " + n);
    TP.start();                                 // avvio esecuzione thread pari                                                // avvio esecuzione thread pari
    TD.start();                                 // avvio esecuzione thread dispari
    try{
      TP.join();                                // attesa terminazione thread
      TD.join();
    }
    catch(Exception e){}
    System.out.println("<-Fine conteggio!");   
  }
 }
