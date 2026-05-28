package com.example.entites;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    // não devemos criar um setter para saldo, porque não queremos que ele seja alterado fácilmente. Ele precisa de uma lógica para ser alterado, mas para resolver o exercício, vou fazer

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
