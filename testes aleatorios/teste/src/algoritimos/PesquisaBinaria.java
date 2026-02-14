package algoritimos;

public class PesquisaBinaria {
    public static int pesquisaBinariaString(String[] lista, String item) {
        int baixo = 0;
        int alto = lista.length - 1;
        int i = 0;

        while (baixo <= alto) {
            i++;
            int meio = (baixo + alto) / 2;
            String chute = lista[meio];
            if (chute.equals(item)) {
                System.out.println("Número de iterações: " + i);
                return meio;
            }
            if (chute.compareTo(item) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        System.out.println("Item não encontrado.");
        return -1;
    }

    public static int pesquisaBinariaInt(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;
        int i = 0;

        while (baixo <= alto) {
            i++;
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
            if (chute == item) {
                System.out.println("Número de iterações: " + i);
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        System.out.println("Item não encontrado.");
        return -1;
    }

    public static int pesquisaBinariaDouble(double[] lista, double item) {
        int baixo = 0;
        int alto = lista.length - 1;
        int i = 0;

        while (baixo <= alto) {
            i++;
            int meio = (baixo + alto) / 2;
            double chute = lista[meio];
            if (chute == item) {
                System.out.println("Número de iterações: " + i);
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        System.out.println("Item não encontrado.");
        return -1;
    }

}
