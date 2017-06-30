package lefonddeletang.expectoPatternum.schtroumpf;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by hugo on 29/06/2017.
 */
public class Pont {
    private static Pont instance;
    private int nombreDeCoupsDeMarteauNecessaires;
    private int nombreDeCoupsDeMarteauDonnees;
    private PontState construit;
    private List<Schtroumpf> travailleurs;
    private Pont(List<Schtroumpf> travailleurs) {
        this.nombreDeCoupsDeMarteauNecessaires = 12;
        this.nombreDeCoupsDeMarteauDonnees = 0;
        this.travailleurs = travailleurs;
        this.construit = new PontAConstruire();
        affectation();

    }
    public static Pont getInstance(List<Schtroumpf> travailleurs) {
        if (instance == null) {
            instance = new Pont(travailleurs);

        }
        return instance;
    }

    private void affectation(){

        for (Schtroumpf sh : travailleurs){
            construit.construire(this,sh);
        }
    }

    private void setState() {
        if (this.nombreDeCoupsDeMarteauDonnees == this.nombreDeCoupsDeMarteauNecessaires) {
            construit = new PontTermine();
            affectation();
            System.out.println("Le Pont est termnié les Schtroupf sont fier de leur travails");
        } else if (this.nombreDeCoupsDeMarteauDonnees < this.nombreDeCoupsDeMarteauNecessaires
                && this.nombreDeCoupsDeMarteauDonnees >= 0) {
            construit = new PontEnConstruction();
        } else {
            construit = new PontAConstruire();

        }

    }

    public void travail(Schtroumpf sch){
        setState();
        System.out.println(construit.toString());
        construit.construire(this, sch);

    }
    public void schtroumpfer(int force){
        this.nombreDeCoupsDeMarteauDonnees = this.nombreDeCoupsDeMarteauDonnees + force ;
        System.out.println("nb de coup de mrteau " + nombreDeCoupsDeMarteauDonnees);
    }



}
