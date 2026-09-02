package com.example.services;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirRelatorio(){
        System.out.printf("Produto: %s \n Preço: R$%.2f \n Quantidade em estoque: %d", this.nome, this.preco, this.quantidade);
    }
}
