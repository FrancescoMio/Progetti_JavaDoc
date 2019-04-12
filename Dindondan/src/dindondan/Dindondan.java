 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 * Questo progetto ha lo scopo di creare e riprodurre una sorta di campana tramite i thread.
 * In seguito andremo a creare: 
 * - un'istanza della classe tramite <strong>new</strong>
 * - un'istanza della classe <strong>Thread</strong> con un'altra new, passando come parametro l'istanza della classe che si è creata
 * - invocare i lmetodo <strong>start()</strong> sul <em>thread</em> creato, producendo la chiamata al suo metodo run().
 * @author FRANCESCO MIO
 * @see https://github.com/FrancescoMio/Progetti_JavaDoc.git
 */
public class Dindondan {

    /**
     * @param args the command line arguments
     * @throws <strong>InterruptedException</strong> generato quando un thread è in attesa, inattivo o occupato in altro modo e il thread viene interrotto, prima o durante l'attività
     */
    public static void main(String[] args) throws InterruptedException {
        //prima modalità di definizione
        Runnable cam1 = new Campana("din" ,5);
        Thread thr1 = new Thread(cam1);
        thr1.start();
        Thread.sleep(1000);
        //seconda modalità di definizione
        Thread thr2 = new Thread(new Campana("don" , 5));
        thr2.start();
        Thread.sleep(1000);
        //terza modalità di definizione
        new Thread(new Campana("dan" , 5)).start();
    }
    
}
