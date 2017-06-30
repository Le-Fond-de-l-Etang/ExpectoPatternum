package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Decorator ajoutant de la barbe a papa a la Pizza
 */
public class BarbeAPapaDecorator extends PizzaDecorator {

	/** Constructeur **/
    public BarbeAPapaDecorator(PizzaAbstact pizzaAgarnir){
        super(pizzaAgarnir, 4,3 );
        this.nomIngredient = "barbe à papa";
    }
}
