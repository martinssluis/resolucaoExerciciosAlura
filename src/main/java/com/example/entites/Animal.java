package com.example.entites;

public class Animal {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.printf("%s emitiu um som!\n", nome);
    }
}
