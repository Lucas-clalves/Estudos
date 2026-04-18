public class Presunto extends PaoDecorator {

    public Presunto(Pao pao) {
        super(pao);
    }

    @Override
    public double preco() {
        return PaoDecorator.preco() + 0.75;
    }
}
