package lefonddeletang.expectoPatternum.schtroumpf;

/**
 * Created by hugo on 29/06/2017.
 */
public class Pont {
    private static Pont instance;
    private int nombreDeCoupsDeMarteauNecessaires;
    private Pont() {
        this.nombreDeCoupsDeMarteauNecessaires = 12;
    }
    public static Pont getInstance() {
        if (instance == null) {
            instance = new Pont();
        }
        return instance;
    }
}
