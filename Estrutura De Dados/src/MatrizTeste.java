import java.util.Scanner;

public class MatrizTeste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

       int [][]matriz= new int[2][2];

       for(int l = 0; l <= 1 ; l++){
           for(int c=0; c<= 1; c++){
               System.out.println("Digite um valor da posição["+l+","+c+"]: ");
               matriz[l][c] = scan.nextInt();
           }
        }

        for(int l = 0; l <= 1 ; l++){
            for(int c=0; c<= 1; c++){
                System.out.println(matriz[l][c]);
            }

        }


    }
}
