package Padaria;
public abstract class PaoDecorator implements Pao {
    Pao PaoDecorator;

    PaoDecorator(Pao pao) {
        this.PaoDecorator = pao;
    }
}
