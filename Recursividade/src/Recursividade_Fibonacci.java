import java.sql.SQLOutput;
import java.util.Scanner;

public class Recursividade_Fibonacci {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int resultado = calcularFibonacci(n);

        System.out.println(calcularFibonacci(n));

    }

    static int calcularFibonacci(int n){
        if(n <=2)
            return 1;
        return calcularFibonacci(n -1) + calcularFibonacci(n-2);
    }
}
