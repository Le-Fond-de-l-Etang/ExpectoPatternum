package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.Observable;

/**
 * Created by hugo on 30/06/2017.
 */
public abstract class PizzaAbstact extends Observable {

    protected PizzaAbstact pizzaAGarnir;
    protected int prix ;
    protected int tempsDeCuisson;
    protected boolean cuit;

    public void cuire(){
        this.cuit = true;
        setChanged();
        notifyObservers(this.cuit);
    }
protected PizzaAbstact(){

}

    protected PizzaAbstact( int prix, int tempsDeCuisson ) {
        this.prix = prix;
        this.tempsDeCuisson = tempsDeCuisson;
    }


    public int getPrix(){
        return prix;
    }
    public void setPrix(int prix){
        this.prix = prix;
    }
    public int getTempsDeCuisson(){
        return tempsDeCuisson;
    }
    public void setTempsDeCuisson(int tempsDeCuisson){
        this.tempsDeCuisson = tempsDeCuisson;
    }
}
