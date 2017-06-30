package lefonddeletang.expectoPatternum.chargeur;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Programme d'assemblage de chargeurs de téléphone
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "===   Assemblage de chargeurs de téléphones   ===\n" );
        
        // Création des files d'attente de transformateur et de chargeur
        final BlockingQueue<Transformateur> transformateurQueue = new LinkedBlockingQueue<Transformateur>(10);
        final BlockingQueue<Chargeur> chargeurQueue = new LinkedBlockingQueue<Chargeur>(75);
        
        // Initialisation des thread producteurs
        TransformateurProducer transformateurProducer = new TransformateurProducer(transformateurQueue);
        new Thread(new ChargeurProducer(transformateurQueue, chargeurQueue, transformateurProducer)).start();
        new Thread(transformateurProducer).start();
    }
}
