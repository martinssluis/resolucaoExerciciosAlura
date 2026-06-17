package com.example.entites;

import com.example.services.Vendavel;

import javax.sound.midi.Soundbank;

public class Servicos implements Vendavel {

    private double preco;
    private int quantidade;
    private double desconto;


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

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double precoTotal() {
        if(quantidade > 10){
            System.out.println("Por ter feito mais de 10 serviços, seu desconto será dobrado!");
            return preco - (desconto*2);
        }
        return  preco - desconto;
    }
}
