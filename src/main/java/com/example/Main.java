package com.example;


import com.example.exceptions.DivisorZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dividendo = 0;
        int divisor = 0;
        boolean dividendoValido = false;
        boolean divisorValido = false;

        while (!dividendoValido) {
            try {
                System.out.print("Informe o dividendo (primeiro número): ");
                dividendo = sc.nextInt();
                if (dividendo<=0){
                    System.out.println("Digite apenas números positivos");
                }else{dividendoValido = true;}
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Ops! Parece que você digitou um algo com uma tipagem diferente do esperado" + e.getMessage());
            }
        }

        while (!divisorValido) {
            try {
                System.out.print("Informe o divisor (segundo número): ");
                divisor = sc.nextInt();
                if (divisor<0){System.out.println("Digite apenas números positivos");}

                else if(divisor ==0){
                    divisorValido = true;
                    throw new DivisorZeroException("Divisor não pode ser 0!");
                }

                divisorValido = true;
            } catch (InputMismatchException error) {
                sc.nextLine();
                System.out.print("Ops! Parece que você digitou um algo com uma tipagem diferente do esperado" + error.getMessage());
            } catch (DivisorZeroException error){System.out.println(error.getMessage());}
        }

        double divisao= dividendo/divisor;
        System.out.println("O resultado da divisão é: "+ divisao);
        System.out.println("Aplicação terminou corretamente");
    }
    }
