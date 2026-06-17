package com.example;


import com.example.entites.*;
import com.example.services.Validacoes;

import java.util.Scanner;

import static com.example.services.Validacoes.lerDouble;
import static com.example.services.Validacoes.lerInteiro;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        ConversorMoeda dolarPraReal = new ConversorMoeda();
//
//        System.out.print("Passe um valor em dolar para ser convertido em real: ");
//        System.out.print(dolarPraReal.converterDolarParaReal(lerDouble(sc)));


//        CalculadoraSalaRetangular retangulo = new CalculadoraSalaRetangular();
//        System.out.print("Informe a altura do retangulo: ");
//        retangulo.setAltura(lerDouble(sc));
//        System.out.print("Informe a largura do retandulo: ");
//        retangulo.setLargura(lerDouble(sc));
//        System.out.println("Área do retangulo: " + retangulo.calcularArea());
//        System.out.println("Perímetro do retangulo: " + retangulo.calcularPerimetro());

        TabuadaMultiplicacao numero = new TabuadaMultiplicacao();
        System.out.print("Informe um número para ver a tabuada até 10 desse número: ");
        numero.setNumero(lerInteiro(sc));
        numero.calculartabuada(numero.getNumero());

        sc.close();
    }
    }
