package pizzaria;

public class MassaIntegral extends PizzaDecorator {

    MassaIntegral(Pizza p) {
        super(p);
    }

    public int preco() {
        return pizzaDecorator.preco() + 5;
    }
}
