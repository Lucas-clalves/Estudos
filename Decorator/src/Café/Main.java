package Café;

public class Main {
    public static void info(Cafe cafe){
        System.out.println("Preço: "+ cafe.informarPreco() + "\nIngredientes: "+cafe.informarIngredientes());
    }

    public static void main(String[] args) {
        
        Cafe c1 = new CafeSimples();
        info(c1);

        c1=new CafeComLeite(c1);
        info(c1);

        c1 = new CafeSimples();
        info(c1);
    }

}
