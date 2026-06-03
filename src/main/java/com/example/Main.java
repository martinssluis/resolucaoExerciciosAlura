package com.example;


import com.example.entites.*;
import com.example.services.Validacoes;

import java.util.Scanner;

import static com.example.services.Validacoes.lerDouble;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // ANIMAIS ******************************************************************************************************
//        Animal loro = new Animal();
//        System.out.print("Qual o nome do animal? ");
//        loro.setNome(sc.nextLine());
//        loro.emitirSom();
//
//        Cachorro cachorro = new Cachorro();
//        System.out.print("Qual o nome do cachorro? ");
//        cachorro.setNome(sc.nextLine());
//        cachorro.emitirSom();
//        cachorro.abanarRabo();
//
//        Gato gato = new Gato();
//        System.out.print("Qual o nome do gato? ");
//        gato.setNome(sc.nextLine());
//        gato.emitirSom();
//        gato.arranharMOveis();

        // Conta *******************************************************************************************************
//        ContaBancaria minhaConta = new ContaBancaria();
//        System.out.print("Quanto você quer depositar na sua Conta bancária? ");
//        minhaConta.depositar(lerDouble(sc));
//        System.out.println("Saldo de R$" + minhaConta.consultarSaldo());
//        System.out.println("Quanto você quer sacar da sa Conta Bancária?");
//        minhaConta.sacar(lerDouble(sc));
//        System.out.println("Saldo de R$" + minhaConta.consultarSaldo());
//
//        ContaCorrente contaCorrente = new ContaCorrente();
//        System.out.print("Quanto você quer depositar na sua Conta Corrente?");
//        contaCorrente.depositar(lerDouble(sc));
//        System.out.println("Saldo de R$" + contaCorrente.consultarSaldo());
//        System.out.print("Quanto você quer sacar da sa Conta Corrente?");
//        contaCorrente.sacar(lerDouble(sc));
//        System.out.println("Saldo de R$" +contaCorrente.consultarSaldo());
//
//        System.out.print("Quanto é a tarifa mensal? ");
//        contaCorrente.cobrarTarifaMensal(lerDouble(sc));
//        System.out.println("Saldo de R$" +contaCorrente.consultarSaldo());

        // Carro *******************************************************************************************************
        ModeloCarro carro1 = new ModeloCarro();
        System.out.print("Qual o modelo do carro?");
        carro1.setNome(sc.nextLine());
        for (int i=0;i<3;i++){
            System.out.println("Qual o ano do carro? ");
            Integer ano = Validacoes.lerInteiro(sc);
            System.out.println("Qual o preço do carro nesse ano? ");
            Double preco = Validacoes.lerDouble(sc);
            carro1.setPrecoPorAno(ano,preco);
            carro1.exibirInformacoes();
        }

        sc.close();
    }
    }
