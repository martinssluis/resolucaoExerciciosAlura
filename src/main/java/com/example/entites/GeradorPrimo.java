package com.example.entites;

public class GeradorPrimo extends NumerosPrimos{

    public void gerarProximoPrimo(int numero){
        do{
            numero ++;
        }while(!verificarPrimalidade(numero));
        System.out.print("O próximo número primo é: " + numero);
    }
}
