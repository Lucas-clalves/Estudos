package D.atividade.bad;

public class TarefaService {
private NotificadorEmail notificador;

    public TarefaService() {
        // ERRO DO DIP: A classe de alto nível está construindo a sua própria dependência!
        this.notificador = new NotificadorEmail(); 
    }

    public void finalizarTarefa(String nomeTarefa) {
        System.out.println("Salvando no banco: Tarefa '" + nomeTarefa + "' concluída.");
        notificador.enviarAlerta("Sua tarefa " + nomeTarefa + " foi finalizada com sucesso!");
    }
}
