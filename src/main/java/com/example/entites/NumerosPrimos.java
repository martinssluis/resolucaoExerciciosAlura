package com.example.entites;

public class NumerosPrimos {

    public  boolean verificarPrimalidade(Integer numero){
        for(int i=2; i<=Math.sqrt(numero); i++){
            int resultado = numero % i;
            if (resultado ==0){
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(Integer numero){
        for (int i = 2; i <= numero; i++) {
            if(verificarPrimalidade(i)){
                System.out.println(i);
            }
        }
    }
}
