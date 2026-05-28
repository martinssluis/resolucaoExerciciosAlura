package com.example;

import com.example.entites.Aluno;
import com.example.entites.IdadePessoa;
import com.example.services.Validacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CONTA BANCARIA **********************************************************************************************
//        ContaBancaria minhaConta = new ContaBancaria();
//        System.out.print("Informe sua conta bancária: ");
//        minhaConta.setNumeroConta(lerInteiro(sc));
//        System.out.print("Informe seu saldo (use ',' em vez de '.'): ");
//        minhaConta.setSaldo(lerDouble(sc));
//
//        // Imprimindo informações da conta
//        System.out.println("Número da conta: " + minhaConta.getNumeroConta());
//        System.out.println("Saldo na conta: " + minhaConta.getSaldo());

        // IDADE PESSOA ************************************************************************************************
        /*
        IdadePessoa eu = null;
        do{
        try{
            System.out.print("Informe o nome da pessoa: ");
            String nome = sc.nextLine();


                System.out.print("Informe o ano de nascimento da pessoa: ");
                int ano = Validacoes.lerInteiro(sc);
                eu = new IdadePessoa(nome, ano);


        }catch (IllegalArgumentException e ){
            // Captura especificamente as regras de negócio da classe IdadePessoa
            System.out.println("❌ " + e.getMessage());
            System.out.println("Por favor, informe o ano novamente.\n");
        }
            } while (eu == null);

        // Imprimendo pessoa
        System.out.printf(
                        """
                        Nome:                       %s
                        Ano de Nascimento:          %d
                        Idade:                      %d
                        Maior de idade?             %s
                        """,
                        eu.getNome(),
                        eu.getAnoNascimento(),
                        eu.getIdade(),
                        eu.maiorDeIdade() ? "Sim" : "Não"
        );
*/
        // PRODUTO *****************************************************************************************************
        // ALUNO *******************************************************************************************************

        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Informe a primeira nota do aluno: ");
        double primeiraNotaAluno = Validacoes.lerDouble(sc);
        aluno.adicionaNota(primeiraNotaAluno);

        System.out.print("Informe a segunda nota do aluno: ");
        double segundaNotaAluno = Validacoes.lerDouble(sc);
        aluno.adicionaNota(segundaNotaAluno);

        System.out.println("A média do aluno é: " + aluno.mediaNotas());
        // LIVRO *******************************************************************************************************

        sc.close();
    }
    }
