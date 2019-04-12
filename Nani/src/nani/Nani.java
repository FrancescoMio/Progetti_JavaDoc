/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * Questo programma ha lo scopo di stampare a video i nomi dei settenani 
 * 
 * @author FRANCESCO MIO
 * @see https://github.com/FrancescoMio/Progetti_JavaDoc.git
 */
public class Nani {

    /**
     * Nel <strong>main</strong> tramite il costruttore <em>ContaNani</em> vengono creati i nuovi 
     * thread mandati in esecuzione con thr1.start() che lancia in concorrenza l'esecuzione del metodo 
     * run().
     * 
     * @param args the command line arguments
     * @throws InterruptedException generato quando un thread è in attesa, inattivo o occupato in altro modo e il thread viene interrotto, prima o durante l'attività
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ContaNani thr1 = new ContaNani("brontolo"); //creazione thread
        ContaNani thr2 = new ContaNani("mammolo");
        ContaNani thr3 = new ContaNani("pisolo");
        ContaNani thr4 = new ContaNani("dotto");
        ContaNani thr5 = new ContaNani("eolo");
        ContaNani thr6 = new ContaNani("cucciolo");
        ContaNani thr7 = new ContaNani("gongolo");
        thr1.start();
        Thread.sleep(1000); //pausa esecuzione thread
        thr2.start();
        Thread.sleep(1000); 
        thr3.start();
        Thread.sleep(1000);
        thr4.start();
        Thread.sleep(1000);
        thr5.start();
        Thread.sleep(1000);
        thr6.start();
        Thread.sleep(1000);
        thr7.start();
    }
    
}
