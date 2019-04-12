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
package nani;

/**
 * In questa classe andremo ad assegnare tramite il costruttore un nome ai thread  
 * ed attraverso il meto run() a stampare a video i nomi dei settenani.
 * @author FRANCESCO MIO
 */
public class ContaNani extends Thread {
    /**
     * Il costruttore ha la funzione di assegnare il nome al thread
     * 
     * @param nome rappresenta il nome assegnato al thread
     */
    ContaNani(String nome) {
        super();
        setName(nome);
    }
    /**
     * Tramite questo metodo andiamo a stampare a video i nomi dei settenani
     */
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 7; i++)
            System.out.println(i+1 + " " + getName());
        //System.out.println("Fine thread");
}
    
}
