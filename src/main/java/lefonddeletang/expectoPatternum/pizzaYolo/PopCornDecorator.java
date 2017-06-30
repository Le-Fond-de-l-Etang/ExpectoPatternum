package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Decorator ajoutant du popcorn a la Pizza
 */
public class PopCornDecorator extends PizzaDecorator {
	/** Constructeur **/
    public PopCornDecorator(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 2, 3);
        this.nomIngredient = "pop corn";
    }
}
