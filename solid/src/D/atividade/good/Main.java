package D.atividade.good;

public class Main {
    public static void main(String[] args) {
        NotficadorSMS notficadorSMS = new NotficadorSMS();
        TarefaService tarefa = new TarefaService(notficadorSMS);
        String mensagem = "   ALERTA!!!   ";

        tarefa.finalizarTarefa(mensagem);
    }

}
