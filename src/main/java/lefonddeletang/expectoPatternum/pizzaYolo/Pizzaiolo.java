package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.Observable;
import java.util.Observer;



/**
 * Pizzaiolo observant de la pizza
 */
public class Pizzaiolo implements Observer {
	/** Mise à jour de l'observateur Pizzaiolo, qui vérifie la cuisson **/
    public void update(Observable o, Object arg) {
        if( (Boolean) arg ) {
            System.out.println(o.toString() +" est cuite.");
        }
    }
}
