package com.example.entites;

import com.example.services.Vendavel;

public class Produto implements Vendavel {

    private double preco;
    private int quantidade;
    private double descontoPrimeiraCompra;

    //TODO se quantidade for maior que 3, o desconto não é aplicavel


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

    public double getDescontoPrimeiraCompra() {
        return descontoPrimeiraCompra;
    }

    public void setDescontoPrimeiraCompra(double descontoPrimeiraCompra) {
        this.descontoPrimeiraCompra = descontoPrimeiraCompra;
    }

    @Override
    public double precoTotal() {
        if (quantidade > 3){
            System.out.println("Por ter mais de 3 produtos, o desconto não será aplicado");
            return preco;
        }
        return preco - descontoPrimeiraCompra;
    }
}
