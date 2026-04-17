package pizzaria;

import java.util.HashMap;

public class PizzariaDominus {
public static void main(String[] args) {
    HashMap<String,Integer> ingredients= new HashMap<>();
    ingredients.put("massa",10 );
    ingredients.put("muzzarela", 20);
    ingredients.put("tomate", 5);
    ingredients.put("mangericao", 5);

    Pizza margerita = new PizzaDominus(ingredients);
    Pizza superMargerita = new ExtraGrande(new BordaRecheada(new MassaIntegral(margerita)));

    System.out.println("minha pizza custa: "+ margerita.preco());
    System.out.println("minha pizza custa: "+ superMargerita.preco());
}
}
