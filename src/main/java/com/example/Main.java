package com.example;


import com.example.entites.Animal;
import com.example.entites.Cachorro;
import com.example.entites.Gato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // ANIMAIS ******************************************************************************************************
        Animal loro = new Animal();
        System.out.print("Qual o nome do animal? ");
        loro.setNome(sc.nextLine());
        loro.emitirSom();

        Cachorro cachorro = new Cachorro();
        System.out.print("Qual o nome do cachorro? ");
        cachorro.setNome(sc.nextLine());
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        System.out.print("Qual o nome do gato? ");
        gato.setNome(sc.nextLine());
        gato.emitirSom();
        gato.arranharMOveis();
        //**************************************************************************************************************

        sc.close();
    }
    }
