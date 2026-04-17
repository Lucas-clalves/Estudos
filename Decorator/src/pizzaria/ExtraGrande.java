package pizzaria;

public class ExtraGrande extends PizzaDecorator {

    ExtraGrande(Pizza p) {
        super(p);
    }

    public int preco() {
        return (int) (pizzaDecorator.preco() * 1.3);
    }
}
