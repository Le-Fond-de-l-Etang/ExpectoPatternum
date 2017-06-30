package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Created by hugo on 29/06/2017.
 */
public class SalsepareilleIngrediant extends PizzaDecorator {
    public SalsepareilleIngrediant(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 7, 1);
        this.ingrediant = "selsepareille";
    }
}
