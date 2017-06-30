package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.Observable;



/**
 * Classe abstraite de pizza générique
 */
public abstract class PizzaAbstact extends Observable {
	/** Pizza héritée **/
    protected PizzaAbstact pizzaAGarnir;
    /** Prix de la pizza **/
    protected int prix ;
    /** Temps de la cuisson **/
    protected int tempsDeCuisson;
    /** Booléen attestant que la pizza est cuite **/
    protected boolean cuit;

    /** Constructeur par défaut **/
	protected PizzaAbstact(){
	
	}
	/**
	 * Constructeur initialisant le prix et le temps de cuisson
	 * 
	 * @param prix
	 * @param tempsDeCuisson
	 */
    protected PizzaAbstact( int prix, int tempsDeCuisson ) {
        this.prix = prix;
        this.tempsDeCuisson = tempsDeCuisson;
    }
	
	/**
	 * Changer la cuisson de la pizza en "cuite", et en notifier les observateurs
	 */
    public void cuire(){
        this.cuit = true;
        setChanged();
        notifyObservers(this.cuit);
    }

	/** Getter de prix **/
    public int getPrix(){
        return prix;
    }
    /** Setter de prix **/
    public void setPrix(int prix){
        this.prix = prix;
    }
    /** Getter du temps de cuisson **/
    public int getTempsDeCuisson(){
        return tempsDeCuisson;
    }
    /** Setter du temps de cuisson **/
    public void setTempsDeCuisson(int tempsDeCuisson){
        this.tempsDeCuisson = tempsDeCuisson;
    }
}
