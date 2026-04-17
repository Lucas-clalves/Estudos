package pizzaria;

import java.util.HashMap;

public class PizzaDominus implements Pizza {
    HashMap<String, Integer> ingredients;

    PizzaDominus(){}

    PizzaDominus(HashMap<String, Integer> ingredients){
        this.ingredients = ingredients;
    }

    public int preco(){
        int valor = 0;
        for (int i : ingredients.values()) valor += i;
        return valor;
    }

}
