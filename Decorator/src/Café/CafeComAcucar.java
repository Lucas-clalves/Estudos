package Café;

public class CafeComAcucar extends CafeDecorator {

    public CafeComAcucar(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double informarPreco() {
        return super.informarPreco()+ 0.50;
    }

    @Override
    public String informarIngredientes() {
        return super.informarIngredientes() + ", Açucar";
    }

}
