package D.atividade.good;

public class NotificadorEmail implements Notficador {
    
    public void enviarAlerta(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
