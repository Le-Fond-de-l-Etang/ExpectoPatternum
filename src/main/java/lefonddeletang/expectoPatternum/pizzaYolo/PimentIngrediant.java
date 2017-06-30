package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Created by hugo on 29/06/2017.
 */
public class PimentIngrediant extends PizzaDecorator {
    public PimentIngrediant(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 9, 8);
        this.ingrediant= "piment";
    }
}
