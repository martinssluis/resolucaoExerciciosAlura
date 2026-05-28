package com.example;

import com.example.entites.Aluno;
import com.example.entites.IdadePessoa;
import com.example.entites.Livro;
import com.example.entites.Produto;
import com.example.services.Validacoes;

import java.util.Scanner;

import static com.example.services.Validacoes.lerDouble;

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
        /*
        Produto fone = new Produto();

        System.out.print("Informe o nome do produto: ");
        fone.setNome(sc.nextLine());
        System.out.print("Informe o preço do produto: ");
        fone.setPreco(lerDouble(sc));
        System.out.print("Informe a porcentagem do desconto que será aplicado (0 a 100): ");
        double desconto = Validacoes.lerDouble(sc);

        System.out.printf(
                        """
                        PRODUTO
                        
                        Nome:                       %s
                        Preço:                      %.2f
                        Desconto:                   %.2f%%
                        Preço com Desconto:         %.2f
                        """
                , fone.getNome(), fone.getPreco(), desconto, fone.aplicarDesconto(desconto)
        );
        */

        // ALUNO *******************************************************************************************************
/*
        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Informe a primeira nota do aluno: ");
        double primeiraNotaAluno = lerDouble(sc);
        aluno.adicionaNota(primeiraNotaAluno);

        System.out.print("Informe a segunda nota do aluno: ");
        double segundaNotaAluno = lerDouble(sc);
        aluno.adicionaNota(segundaNotaAluno);

        System.out.println("A média do aluno é: " + aluno.mediaNotas());

*/
        // LIVRO *******************************************************************************************************

        Livro coraline = new Livro();
        System.out.print("Informe o titulo do livro: ");
        coraline.setTitulo(sc.nextLine());
        System.out.print("Informe o autor do livro: ");
        coraline.setAutor(sc.nextLine());
        coraline.exibirDetalhes();

        sc.close();
    }
    }
