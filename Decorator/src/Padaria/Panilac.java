package Padaria;

public class Panilac {
    public static void main(String[] args) {

        Pao pao = new PaoPanilac();
        pao = new Presunto(pao);
        System.out.println(pao.preco());

        Pao pao2 = new PaoPanilac();

        pao2 = new Manteiga(new Queijo(new Presunto(pao2)));
        System.out.println(pao2.preco());

    }

}
