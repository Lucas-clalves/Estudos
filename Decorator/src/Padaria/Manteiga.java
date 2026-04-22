package Padaria;

public class Manteiga extends PaoDecorator{

    public Manteiga(Pao pao) {
        super(pao);
    }

    @Override
    public double preco(){
        return PaoDecorator.preco() + 0.50;
    }

}
