package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Decorator ajoutant de la salsepareille a la Pizza
 */
public class SalsepareilleDecorator extends PizzaDecorator {
	/** Constructeur **/
    public SalsepareilleDecorator(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 7, 1);
        this.nomIngredient = "selsepareille";
    }
}
