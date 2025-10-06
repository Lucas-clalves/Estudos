import java.util.Scanner;

public class MatrizTeste2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int par=0, impar=0;
        int [][]matriz= new int[5][5];

        for(int l = 0; l <= 4 ; l++){
            for(int c=0; c<= 4; c++){
                System.out.println("Digite um valor da posição["+l+","+c+"]: ");
                matriz[l][c] = (int) (Math.random() *100)+1;
            }
        }

        for(int l = 0; l <= 4 ; l++){
            for(int c=0; c<= 4; c++){
                if (matriz[l][c]%2==0){
                    par = par+1;
                    System.out.println("O numero ("+matriz[l][c]+") que esta na posição ["+l+","+c+"] é par.");
                }
                else{
                    impar = impar+1;
                    System.out.println("O numero ("+matriz[l][c]+") que esta na posição ["+l+","+c+"] é impar.");
                }
            }

        }
        System.out.println("A matriz possui "+par+" mumeros pares e "+impar+" numeros impar.");

        for(int l = 0; l <= 4 ; l++){
            for(int c=0; c<= 4; c++) {
                System.out.println("numeros da matriz: "+matriz[l][c]);

            }
        }

    }
        }
