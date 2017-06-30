package lefonddeletang.expectoPatternum.schtroumpf;

import java.util.List;

/**
 * Pont à construire par les schtroumpfs
 * 
 * Note : Les schtroumpf ont l'habitude de construire un barrage,
 * mais leur environnement ne se prête cependant pas à la construction d'un pont.
 */
public class Pont {
	/** Instance singleton de pont **/
    private static Pont instance;
    
    /** Nombre de coups nécessaires à la réalisation du pont **/
    private int nombreDeCoupsDeMarteauNecessaires;
    /** Nombre de coups déjà donnés par les schtroumpfs sur le pont **/
    private int nombreDeCoupsDeMarteauDonnees;
    /** Etat du pont **/
    private PontState construit;
    /** Liste des schtroumpfs travaillant sur le pont **/
    private List<Schtroumpf> travailleurs;
    
    
    
    /** 
     * Constructeur de l'objet Pont
     * 
     * Initialise les coups de marteau, l'état et les travailleurs
    **/
    private Pont(List<Schtroumpf> travailleurs) {
        this.nombreDeCoupsDeMarteauNecessaires = 12;
        this.nombreDeCoupsDeMarteauDonnees = 0;
        this.travailleurs = travailleurs;
        this.construit = new PontAConstruire();
        affecterSchtroumpfs();

    }
    
    /**
     * Singleton (lazy) de création de l'instance de pont
     * 
     * @param travailleurs Liste des schtroumpfs qui vont travailler sur le pont
     */
    public static void createInstance(List<Schtroumpf> travailleurs) {
        if (instance == null) {
            instance = new Pont(travailleurs);
        }
    }

    
    
    /**
     * Affecte tous les schtroumpfs, qui vont construire le pont en fonction de son état
     */
    private void affecterSchtroumpfs(){
        for (Schtroumpf sh : travailleurs){
            construit.construire(this,sh);
        }
    }

    /**
     * Modifie l'état de construction du pont selon le nombre de coups donnés
     */
    private void setState() {
        if (this.nombreDeCoupsDeMarteauDonnees == this.nombreDeCoupsDeMarteauNecessaires) {
            construit = new PontTermine();
            affecterSchtroumpfs();
            System.out.println("Le Pont est terminé les Schtroumpfs sont fiers de leur travail.");
        } else if (this.nombreDeCoupsDeMarteauDonnees < this.nombreDeCoupsDeMarteauNecessaires
                && this.nombreDeCoupsDeMarteauDonnees >= 0) {
            construit = new PontEnConstruction();
        } else {
            construit = new PontAConstruire();
        }
    }

    /**
     * Fait travailler un schtroumpf sur le pont, et appelle la méthode de construction pouvant varier selon l'état du pont
     * 
     * @param schtroumpf Schtroumpf concerné par le travail
     */
    public void travail(Schtroumpf schtroumpf){
        setState();
        System.out.println("Etat du pont : " + construit.toString());
        construit.construire(this, schtroumpf);

    }
    
    /**
     * Schtroumpfe le pont en fonction de la force du schtroumpf et en affiche l'état.
     * 
     * @param force Force du schtroumpf schtroumpfant
     */
    public void schtroumpfer(int force){
        this.nombreDeCoupsDeMarteauDonnees = this.nombreDeCoupsDeMarteauDonnees + force ;
        System.out.println("Nombre de coup de marteau : " + nombreDeCoupsDeMarteauDonnees + '\n');
    }
}
