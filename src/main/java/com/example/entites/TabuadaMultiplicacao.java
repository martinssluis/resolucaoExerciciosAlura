package com.example.entites;

import com.example.services.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void calculartabuada(int numero){
        for(int i=0;i<=10;i++){
            System.out.println(numero + "x" + i + " = " + numero*i);
        }

    }
    @Override
    public void mostrarTabuada() {

    }
}
