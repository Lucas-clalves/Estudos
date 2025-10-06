public class Recursividade_Fatorial {
    public static void main(String[] args){


        int numero =5;
        int resultado = recursividade(numero);

        System.out.println(resultado);
    }


    private static int recursividade (int numero){

        if(numero==1){
            return 1;
        }

        return numero * recursividade(numero -1);

    }
}
