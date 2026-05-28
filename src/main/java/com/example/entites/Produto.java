package com.example.entites;

public class Produto {

    private String nome;
    private double preco;

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
        if(preco < 0){
            throw new IllegalArgumentException("Os preços devem ser positivos");
        }
        this.preco = preco;
    }

    public double aplicarDesconto(double desconto){
        if (desconto < 0 || desconto > 100) {
            throw new IllegalArgumentException("O desconto deve ser entre 0% e 10%");
        }
        return this.preco *=  (1 - (desconto/100));
    }

}
