package lefonddeletang.expectoPatternum.chargeur;

/**
 * Programme d'assemblage de chargeurs de téléphone
 */
public class App 
{
	
	public static void main(String[] args) {
        System.out.println( "===   Assemblage de chargeurs de téléphones   ===\n" );
        
        // Création des files d'attente de transformateur et de chargeur
        final FileDAttente<Transformateur> transformateurQueue = new FileDAttente<Transformateur>(10);
        final FileDAttente<Chargeur> chargeurQueue = new FileDAttente<Chargeur>(75);
        
        // Création des producteurs
        ChargeurProducer chargeurProducer = new ChargeurProducer(transformateurQueue, chargeurQueue);
        TransformateurProducer transformateurProducer = new TransformateurProducer(transformateurQueue);
        
        // Lancement des processus de production
        new Thread(chargeurProducer).start();
        new Thread(transformateurProducer).start();
        
        // Observation du producteur de transformateur par celui de chargeur (utilisé pour stopper toutes les chaînes)
        chargeurProducer.linkTransformateurProducer(transformateurProducer);
    }
}
