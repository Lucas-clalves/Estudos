import algoritimos.PesquisaBinaria;

public class TestePesquisaBinaria {
    public static void main(String[] args) {

        int i = 0;
        int[] lista = new int[256];
        while (i < lista.length) {
            lista[i] = i + 1;
            i++;
        }
        System.out.println(PesquisaBinaria.pesquisaBinariaInt(lista, 256));
    }
}
