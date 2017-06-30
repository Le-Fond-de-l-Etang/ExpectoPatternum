package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hugo on 30/06/2017.
 */
public class Pizzailo implements Observer {
    public void update(Observable o, Object arg) {

        if( (Boolean) arg ) {
            System.out.println( o.toString() +" est cuite");
        }
    }
}
