package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * Created by hugo on 30/06/2017.
 */
public class Four {
    private static Four instance;

    private Four(){

    }
    public static Four getInstance(){
        if (instance == null) {
            instance = new Four();
        }
        return instance;
    }

    public void cuirePizza(PizzaAbstact pizza) throws InterruptedException {
        TimeUnit.SECONDS.sleep(pizza.getTempsDeCuisson());
        pizza.cuire();
    }

}
