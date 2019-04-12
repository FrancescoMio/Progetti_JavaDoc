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
package principale;

/**
 * Questa classe è formata da un costruttore ed un metdo: il costruttore public CalcoloEdInserisco (double b, GestCalcoli gc)
 * crea le viarbili da utilizzare per la somma mentre il metodo public void run() effettua la vera e propria operazione
 * stampando a video i risultati.
 * @author FRANCESCO MIO
 */
public class CalcoloEdInserisco implements Runnable{
    private double b;
    private GestCalcoli gc;
    
    /**
     * Il costruttore crea le viarbili da utilizzare per la somma
     * 
     * @param b Rappresenta il valore che vogliamo sommare 
     * @param gc Rappresenta il valore o il risultato a cui viene sommato il numero b
     */
    public CalcoloEdInserisco (double b, GestCalcoli gc){
        this.b = b;
        this.gc = gc;
    }
    
    /**
     * Il metodo run() ha la funzione di sommare le due variabili precedentemente assegnate
     * e stampare a video i risultati calcolati dai thread
     */
    public void run(){
        gc.setRisultato(gc.getRisultato()+b);
        System.out.println(Thread.currentThread().getName() + " " + gc.getRisultato());
    }
}
