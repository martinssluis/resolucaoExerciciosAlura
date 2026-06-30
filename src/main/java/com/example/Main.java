package com.example;


import com.example.entities.Pessoa;

import java.util.Scanner;

import static com.example.services.Validacoes.lerInteiro;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa eu = new Pessoa();
        System.out.print("Iforme o nome da pessoa: ");
        eu.setNome(sc.nextLine());
        System.out.print("Informe a idade da pessoa: ");
        eu.setIdade(lerInteiro(sc));

        System.out.println(eu.toString());

        sc.close();
    }
    }
