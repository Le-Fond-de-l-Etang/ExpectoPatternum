package lefonddeletang.expectoPatternum.schtroumpf;

import java.util.concurrent.TimeUnit;



/**
 * Schtroumpf, conçu pour travailler sur le pont à la sueur de son front
 */
public class Schtroumpf implements java.lang.Runnable {
	/** Nom du schtroumpf (non négligeable) **/
    protected String nom;
    /** Marteau dont le schtroumpf se sert (quand il ne mange pas de salsepareille) **/
    protected Marteau outil;
    /** Pont objectif sur lequel le schtroumpf doit travailler (quand il ne mange pas de salsepareille) **/
    protected Pont objectif;
    /** Force du schtroumpf qui influera sur son efficacité à construire un pont et à frapper le schtroumpf à lunettes **/
    protected int force;
    /** Cooldown du schtroumpf = temps d'attente entre les actions du schtroumpf **/
    protected int coeficiantDeRefroidissement;

    
    
    /**
     * Constructeur du schtroumpf
     * 
     * @param nom Nom donné au schtroumpf
     */
    public Schtroumpf(String nom) {
        this.nom = nom;
        this.force = 1;
        this.coeficiantDeRefroidissement = 2;
    }

    /** Setter de l'outil marteau du schtroumpf **/
    public void setOutil(Marteau outil) {
        this.outil = outil;
    }

    /** Setter de l'objectif pont du schtroumpf **/
    public void setObjectif(Pont pont){
        this.objectif = pont;
    }

    
    
	/**
	 * Action de taper sur l'objectif (qui est un pont et non un schtroumpf à lunettes)
	 */
    private void tape(){
        System.out.println("Schtroumpf " + this.nom + " tape avec le marteau !");
        objectif.travail(this);
    }

    /**
     * Essaye de prendre possession du marteau et de s'en servir
     * 
     * @throws InterruptedException
     */
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

    /**
     * Boucle de conscience du schtroumpf, s'arrête à sa mort (qui peut être considérée comme une exception)
     */
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
