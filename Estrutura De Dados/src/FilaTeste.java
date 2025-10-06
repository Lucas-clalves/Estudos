import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaTeste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("fila de banco.");
        System.out.println("Permitido somente entrada de 5 em 5.");
        Queue<String> pessoas = new LinkedList<>();

        for(int cont=1; cont<=5;cont++) {
            System.out.println("escreva seu nome e entre na fila.");


            pessoas.offer(scan.nextLine());
        }
        System.out.println("pessoas na fila de espera"+pessoas);



        for(int i=1;i<=5;i++) {
            System.out.println("Ainda estão na fila " +pessoas);
            System.out.println("Proximo.");
            pessoas.remove();

        }

        scan.close();

    }

}