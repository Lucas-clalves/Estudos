import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PilhaTeste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("caminhão de mudança");

        Deque<String> caminhãoPilha = new ArrayDeque<>();

        System.out.println("Alocando moveis.");

        int cont;

        for(cont=0; cont<10; cont++){
            System.out.println("movel numero "+cont);
            caminhãoPilha.push( scan.nextLine());
        }

        System.out.println("Caminhão carregado!!");
        System.out.println("Quantidade de moveis é de "+cont+".");
        System.out.println("Os moveis são "+caminhãoPilha);

        String fundoCaminhão = caminhãoPilha.peek();
        System.out.println("movel mais ao fundo do caminhão é "+fundoCaminhão);

        System.out.println("começando a descarregar.");
        while (!caminhãoPilha.isEmpty()) {
            String movelRemovido = caminhãoPilha.pop();
            System.out.println(movelRemovido+ " removodo.");
        }

        System.out.println("O caminhão contem "+caminhãoPilha.size()+" itens.");

        scan.close();

    }
}