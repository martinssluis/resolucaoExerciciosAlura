package com.example.entites;

public class ContaBancaria {
    protected double saldo;

    public double depositar(double valor){
        return saldo += valor;
    }

    public double sacar(double valor){
        return saldo -= valor;
    }

    public double consultarSaldo(){
        return saldo;
    }
}
