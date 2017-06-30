package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.concurrent.TimeUnit;



/**
 * Four utilisé pour cuire les pizzas
 */
public class Four {
	/** Instance singleton du four **/
    private static Four instance;

    /** Constructeur **/
    private Four(){

    }
    
    /** Singleton de four **/
    public static Four getInstance(){
        if (instance == null) {
            instance = new Four();
        }
        return instance;
    }

    /** Cuire une pizza en fonction de son temps de cuisson **/
    public void cuirePizza(PizzaAbstact pizza) throws InterruptedException {
        TimeUnit.SECONDS.sleep(pizza.getTempsDeCuisson());
        pizza.cuire();
    }
}
