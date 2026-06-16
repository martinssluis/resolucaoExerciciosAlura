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

    //TODO: criar forma de calcular a tabuada
    //for i<=1= exibir numero
    // ex: 3
    //3x{i=1}=3 i++
    //3x{i=2} =6

    public void calculartabuada(int numero){
        for(int i=0;i<=10;i++){
        }

    }
    @Override
    public void mostrarTabuada() {

    }
}
