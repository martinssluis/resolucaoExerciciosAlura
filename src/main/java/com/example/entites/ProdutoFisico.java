package com.example.entites;

import com.example.services.Calculavel;

public class ProdutoFisico implements Calculavel {

    private double preco;
    private double descontoBlackFriday;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDescontoBlackFriday() {
        return descontoBlackFriday;
    }

    public void setDescontoBlackFriday(double descontoBlackFriday) {
        this.descontoBlackFriday = descontoBlackFriday;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - descontoBlackFriday;
    }
}
