import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteEmUmOutput {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        JOptionPane.showMessageDialog(null, "Escolha 1 ou escolha 2");
        Scanner scan = new Scanner(System.in);
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                int soma = a + b;
                JOptionPane.showMessageDialog(null, "A soma é: " + soma);
                break;
        
            default:
                int div = a / b;
                JOptionPane.showMessageDialog(null, "A divisão é: " + div);
                break;
        }
    }
}