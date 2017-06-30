package lefonddeletang.expectoPatternum.schtroumpf;

/**
 * Created by hugo on 29/06/2017.
 */
public class Marteau {
    private static Marteau instance;
    private boolean disponible;
    private Marteau() {
        this.disponible = true ;
    }
    public static Marteau getInstance() {
        if (instance == null) {
            instance = new Marteau();
        }
        return instance;
    }

    public Boolean getDisponible() {
        return this.disponible;
    }
    public void  setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

}
