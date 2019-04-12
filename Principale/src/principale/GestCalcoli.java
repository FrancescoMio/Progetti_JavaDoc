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
 * Questa classe ha lo scopo di ritornare e settare il risultato.  
 * @author FRANCESCO MIO
 */
public class GestCalcoli {
    private double risultato;

    /**
     * Questo metodo ritorna il risultato 
     * @return ritorna il risultato 
     */
    public double getRisultato() {
        return risultato;
    }

    /**
     * Questo metodo assegna all'attributo risultato il valore passato come parametro
     * @param risultato rappresenta il valore che verrà assegnato all'attributo risultato
     */
    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }
    
}
