
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
package dindondan;

/**
 * In questa classe andiamo a creare tramite il costruttore la campana e attraverso il metodo public void run() 
 * ,che implementa l'interfaccia <em>Runnable</em>, a stampare a video i nomi dei suoni.
 * 
 * @author FRANCESCO MIO
 */
public class Campana implements Runnable{
    String suono;
    int volte;
    
    /**
     * Costruiamo la classe campana e come parametri del costruttore indichiamo il suono che deve emettere e quante 
     * volte dovrà essere eseguito
     * @param suono suono che deve emettere la campana
     * @param volte quante volte dovrà essere eseguito 
     */
    public Campana(String suono, int volte){
        this.suono = suono;
        this.volte = volte;
    }
    
    /**
     * Una caratteristica del metodo run() è invece l'assenza di parametri, sia in ingresso sia in uscita.
     * Questo comporta che, qualora ci sia la necessità di passare parametri al <strong>thread</strong>, dobbiamo
     * dobbiamo servirci del costruttore, passare tali dati come parametri e scriverli nelle variabili di istanza della classe.
     * Il metodo <strong>run()</strong>, così come tutti i metodi della classe, ha la visibilità di tali variabili di classe e quindi è
     * possibile accedervi, leggere e modificarle.
     */
    public void run(){
        for(int k = 0; k < volte; k++){
            System.out.print ((k + 1) + suono + " ");
        }
    }
}
