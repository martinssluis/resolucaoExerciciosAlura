package com.example.entities;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    //TODO: construtor que aceite parametros para inicializar os atributos

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //TODO: implementar metodo toString para retornar yma representação em texto do objeto
    @Override
    public String toString() {
        return "Produto: " + this.nome + " com valor de R$" + this.preco + " quantidade: " + this.quantidade;
    }
}
