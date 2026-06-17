package com.example.entites;

import com.example.services.Calculavel;

public class Livro implements Calculavel {

    private double preco;
    private double taxaEntrega;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxaEntrega;
    }
}
