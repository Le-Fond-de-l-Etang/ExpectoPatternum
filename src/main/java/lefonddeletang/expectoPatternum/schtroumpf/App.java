package lefonddeletang.expectoPatternum.schtroumpf;

import java.util.ArrayList;
import java.util.List;

/**
 * Programme d'entrée du monde des schtroumpfs
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("===   Les schtroumpfs vont vous construire un pont   ===\n");
    	
    	// Instanciation du marteau créateur de pont
        Marteau marteau = Marteau.getInstance();

        // Instanciation des schtroumpfs travailleurs
        Schtroumpf bricoleur = new Schtroumpf("bricoleur");
        Schtroumpf aLunnette = new Schtroumpf("à lunette");
        Schtroumpf farceur = new Schtroumpf("farceur");

        // Assignation du marteau aux schtroumpfs travailleurs
        bricoleur.setOutil(marteau);
        aLunnette.setOutil(marteau);
        farceur.setOutil(marteau);
        
        // Ségrégation des schtroumpfs travailleurs dans une liste
        List<Schtroumpf> travailleurs = new ArrayList<Schtroumpf>();
        travailleurs.add(bricoleur);
        travailleurs.add(aLunnette);
        travailleurs.add(farceur);

        // Création de l'instance du pont
        Pont.createInstance(travailleurs);

        // Démarrage de la vie des schtroumpfs travailleurs
        (new Thread(bricoleur)).start();
        (new Thread(aLunnette)).start();
        (new Thread(farceur)).start();
    }
}
