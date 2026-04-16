package D.atividade.good;

public class NotficadorSMS implements Notficador {

@Override
public void enviarAlerta(String mensagem){
    System.out.println("Enviando SMS: " + mensagem);
}
}
