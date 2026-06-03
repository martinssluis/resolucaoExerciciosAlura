package com.example.entites;

public class NumerosPrimos {

    //TODO: verificarPrimalidade()
    public boolean verificarPrimalidade(Integer numero){
        for(int i=2; i<Math.sqrt(numero); i++){
            int resultado = numero%i;
            if (resultado ==0){
                return false;
            }
        }
        return true;
    }


    //TODO: listarPrimos()
}
