package com.example;


import com.example.entities.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.example.services.Validacoes.lerInteiro;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa eu = new Pessoa();
        eu.setNome("Luis");
        eu.setIdade(22);

        Pessoa amanda = new Pessoa();
        amanda.setNome("Amanda");
        amanda.setIdade(25);

        Pessoa endrick = new Pessoa();
        endrick.setNome("Endrick");
        endrick.setIdade(19);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.addAll(Arrays.asList(eu, amanda, endrick));

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas.toString());

        sc.close();
    }
    }
