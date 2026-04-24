package arraylist;
import java.util.ArrayList;

public class Tasks {
public static void main(String[] args) {
    ArrayList<String> listTasks = new ArrayList<>();
    listTasks.add("comprar pão");
    listTasks.add("tomar banho");
    listTasks.add("lavar roupa");

    if (listTasks == null || listTasks.isEmpty()) {System.out.println("Lista esta vazia!");return;}
    for (String task : listTasks) {
        System.out.println(task);
    }
    System.out.println("Numero de tarefas: "+listTasks.size());
    
}
}