public class User {
    private int id;
    private String nome;
    private int idade;

    public User(String nome, int idade){
        setNome(nome);
        setIdade(idade);
        setId(idade);
    }

    public int getId() {
        return id;
    }
    public void setId() {
    this.id = (int) Math.random()*100;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
