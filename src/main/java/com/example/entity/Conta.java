package com.example.entity;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$"+this.saldo);
    }

    public double zerarSaldo(){
        return this.saldo-=this.saldo;
    }
}
