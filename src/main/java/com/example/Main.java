package com.example;


import com.example.entites.*;
import com.example.services.Validacoes;

import java.util.Scanner;

import static com.example.services.Validacoes.lerDouble;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ConversorMoeda dolarPraReal = new ConversorMoeda();

        System.out.print("Passe um valor em dolar para ser convertido em real: ");
        System.out.print(dolarPraReal.converterDolarParaReal(lerDouble(sc)));


        sc.close();
    }
    }
