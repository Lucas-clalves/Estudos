package com.lucas_clalves.mokito;

import java.util.Random;

public class Order{
    private int id;
    private String nome;
    private int idade;

    private static final Random random = new Random();

    public Order(String nome, int idade){
        setNome(nome);
        setIdade(idade);
        setId();
        
    }

    public int getId() {
        return id;
    }
    public void setId() {
    this.id = (random.nextInt(100))+1;
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
