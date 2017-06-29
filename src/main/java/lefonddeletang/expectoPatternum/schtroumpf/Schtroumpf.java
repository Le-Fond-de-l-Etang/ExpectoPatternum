package lefonddeletang.expectoPatternum.schtroumpf;

import java.lang.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by hugo on 29/06/2017.
 */
public class Schtroumpf implements java.lang.Runnable {
    protected String nom;
    protected Marteau outil;
    protected Pont objectif;
    protected int force;
    protected int coeficiantDeRefroidissement;

    public Schtroumpf(String nom) {
        this.nom = nom;
        this.force = 1;
        this.coeficiantDeRefroidissement = 2;
    }

    public void setOutil(Marteau outil) {
        this.outil = outil;
    }

    public void setObjectif(Pont pont){
        this.objectif = pont;
    }

    private void tape(){
        System.out.println("Schtroumpf " + this.nom + " tape avec le marteau");
        objectif.travail(this);
    }

    private void prendMarteau() throws InterruptedException{

        if (outil.getDisponible()) {
            outil.setDisponible(false);
            tape();
            outil.setDisponible(true);
            TimeUnit.SECONDS.sleep(this.coeficiantDeRefroidissement);
        } else {
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public void run() {
        while (true) {
            if (this.objectif != null) {
                try {
                    prendMarteau();
                } catch (Exception e) {
                    return;
                }
            }
        }
    }
}
