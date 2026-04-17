package pizzaria;

public class BordaRecheada extends PizzaDecorator {

    BordaRecheada(Pizza p) {
        super(p);
    }

    public int preco() {
        return pizzaDecorator.preco() + 10;
    }

}
