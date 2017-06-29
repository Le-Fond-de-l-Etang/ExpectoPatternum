package lefonddeletang.expectoPatternum.genealogie;

import java.util.List;
import java.util.Optional;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "===   Genealogie de la famille Barbapapa   ===" );
        
        /// Instanciation des membres de la famille Barbapapa
        
        // Création des parents de la famille Barbapapa
        Homme barbapapa = new Homme("barbapapa");
        Femme barbamama = new Femme("barbamama");
        // Mariage des parents de la famille Barbapapa
        Personne.marierCouple(barbapapa, barbamama);
        
        // Création des enfants des parents de la famille Barbapapa
        Homme barbouille = new Homme("barbouille");
        Femme barbotine = new Femme("barbotine");
        Personne.ajouterEnfantACouple(barbapapa, barbamama, barbouille);
        Personne.ajouterEnfantACouple(barbapapa, barbamama, barbotine);
        
        // Création des enfants des enfants des parents de la famille Barbapapa
        /** Note:
         *  L'inceste au sein de la famille Barbapapa ne se base sur aucune preuve tangible.
         */
        Personne.marierCouple(barbouille, barbotine);
        Personne.ajouterEnfantACouple(barbouille, barbotine, new Homme("barbibul"));
        Personne.ajouterEnfantACouple(barbouille, barbotine, new Femme("barbabelle"));
        Personne.ajouterEnfantACouple(barbouille, barbotine, new Homme("barbidur"));
        Personne.ajouterEnfantACouple(barbouille, barbotine, new Femme("barbidou"));
        
        
        
        /// Affichage d'informations sur la famille Barbapapa
        
        // Affichage de Barbapapa et de sa femme
        Optional<Femme> barbapapaFemme = barbapapa.getFemme();
        if (barbapapaFemme.isPresent()) {
        	System.out.println("Au commencement était " + barbapapa.getNom() + " et sa femme " + barbapapaFemme.get().getNom() + ".");
        } else {
        	System.out.println("Au commencement était " + barbapapa.getNom() + ".");
        }
        // Affichage des enfants de Barbapapa
        System.out.println(barbapapa.getNom() + " eut beaucoup d'enfants : ");
        afficherPersonneEtEnfants(barbapapa, "");
        afficherPersonneEtEnfants(barbamama, "");
    }
    
    
    
    /**
     * Affichage récursif d'une Personne et de ses enfants
     * 
     * @param personne Barbapapa racine
     * @param prefixe Préfixe utilisé pour indenter les nouvelles générations
     */
    public static void afficherPersonneEtEnfants(Personne personne, String prefixe) {
    	System.out.println(prefixe + personne.getNom());
    	prefixe += "\t";
    	List<Personne> enfants = personne.getEnfants();
    	for (Personne enfant : enfants) {
    		afficherPersonneEtEnfants(enfant, prefixe);
    	}
    }
}
