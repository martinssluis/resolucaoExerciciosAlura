package com.example.entites;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;
    
    public double cobrarTarifaMensal(double tarifaMensal){
        return saldo -= this.tarifaMensal;
    }
}
