package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Created by hugo on 29/06/2017.
 */
public class PopCornIngrediant extends PizzaDecorator {
    public PopCornIngrediant(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 2, 3);
        this.ingrediant = "pop corn";

    }
}
