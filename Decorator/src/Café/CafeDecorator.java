package Café;

public abstract class CafeDecorator implements Cafe {
    private Cafe cafeDecorator;

    CafeDecorator(Cafe cafe) {
        this.cafeDecorator = cafe;
    }

    @Override
    public double informarPreco() {
        return cafeDecorator.informarPreco();
    }

    @Override
    public String informarIngredientes() {
        return cafeDecorator.informarIngredientes();
    }
}
