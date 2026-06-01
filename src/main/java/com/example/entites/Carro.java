package com.example.entites;

public class Carro {

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
        this.preco = preco;
    }

    //TODO: métodos para representar o modelo ao longo de 3 anos
    //TODO: método para definir o nome do modelo
    //TODO: preço médio para cada ano
    //TODO: calcuar e exibir o menor e maior preço
    //TODO: subclasse ModeloCarro para criar instâncias especificas, utilizando a classe principal para definir e mostrar informações
}
