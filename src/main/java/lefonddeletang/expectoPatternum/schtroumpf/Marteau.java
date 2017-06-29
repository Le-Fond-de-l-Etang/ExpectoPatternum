package lefonddeletang.expectoPatternum.schtroumpf;

/**
 * Created by hugo on 29/06/2017.
 */
public class Marteau {
    private static Marteau instance;
    private Marteau() {

    }
    public static Marteau getInstance(){
        if (instance == null) {
            instance = new Marteau();
        }
        return instance;
    }
}