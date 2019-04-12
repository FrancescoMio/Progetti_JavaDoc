/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 * Questo progetto ha lo scopo di effettuare somme di numeri tramite i <em>thread</em>
 * 
 * @author FRANCESCO MIO
 * @see https://github.com/FrancescoMio/Progetti_JavaDoc.git
 */
public class Principale {

    /**
     * Nel main andiamo a creare tramite i costruttori le classi GestCalcoli e CalcoloEdInserisco lanciando successivamente i <em>thread</em>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestCalcoli GC = new GestCalcoli();
        GC.setRisultato(0);
        System.out.println(GC.getRisultato());
        
        for(int i=0; i< 10;i++)
            new Thread(new CalcoloEdInserisco(1,GC)).start();
        
        while(Thread.activeCount() > 1){
            System.out.println(Thread.activeCount());
        }
        
        System.out.println("Ora ho concluso");
        System.out.println(Thread.activeCount());
        System.out.println("Risulato finale: " + GC.getRisultato());
    }   
}
