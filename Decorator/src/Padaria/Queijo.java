public class Queijo extends PaoDecorator{

    public Queijo(Pao pao) {
        super(pao);
    }
    
    public double preco(){
        return PaoDecorator.preco() + 1.50;
    }
}
