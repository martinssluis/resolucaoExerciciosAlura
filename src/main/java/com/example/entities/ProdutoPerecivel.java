package com.example.entities;

import java.util.Date;

public class ProdutoPerecivel extends Produto{

    private Date dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto Perecivel: " + this.getNome() + " com valor de R$" + this.getPreco() + " quantidade: " + this.getQuantidade() + "e data de validade: " + this.getDataValidade();
    }
}
