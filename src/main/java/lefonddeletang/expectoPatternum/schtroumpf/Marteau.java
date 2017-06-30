package lefonddeletang.expectoPatternum.schtroumpf;



/**
 * Marteau dont se sert les schtroumpfs
 */
public class Marteau {
	/** Instance singleton du marteau **/
    private static Marteau instance;
    /** Disponibilité du marteau **/
    private boolean disponible;
    
    /**
     * Constructeur, fixant la disponibilité à true
     */
    private Marteau() {
        this.disponible = true ;
    }
    
    /**
     * Accesseur singleton du marteau (les schtroumpfs n'ont qu'un marteau)
     * 
     * @return Instance du marteau
     */
    public static Marteau getInstance() {
        if (instance == null) {
            instance = new Marteau();
        }
        return instance;
    }

    /** Getter de la disponibilité **/
    public Boolean getDisponible() {
        return this.disponible;
    }
    
    /** Setter de la disponibilité **/
    public void  setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
