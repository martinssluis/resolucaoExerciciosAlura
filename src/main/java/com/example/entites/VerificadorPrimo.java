package com.example.entites;

public class VerificadorPrimo extends NumerosPrimos{

    public void verificarSeEhPrimo(Integer numero){
    boolean ehPrimo = verificarPrimalidade(numero); // ao chamar o metodo, ele espera um parametro
        if (ehPrimo){ // se o resultado de verificarPrimalidade() for true
            System.out.print("O número é primo");
        }else{
            System.out.print("O número não é primo");
        }
    }
}
