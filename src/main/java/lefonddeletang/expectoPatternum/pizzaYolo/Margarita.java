package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Pizza Margarita héritant de la pizza abstraite
 */
public class Margarita  extends PizzaAbstact {
	/** Constructeur **/
    public Margarita(int prix,int tempsDeCuisson) {
        super(prix, tempsDeCuisson);

    }
    /** Affiche le nom représentant la pizza **/
    public String toString(){
        return "Pizza Margarita";
    }
}
