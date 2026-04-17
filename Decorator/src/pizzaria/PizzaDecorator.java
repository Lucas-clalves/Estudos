package pizzaria;

public abstract class PizzaDecorator implements Pizza{

    Pizza pizzaDecorator;

    PizzaDecorator(Pizza pizza){
        pizzaDecorator = pizza;
    }
    
}