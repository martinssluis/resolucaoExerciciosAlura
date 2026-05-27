package com.example.services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacoes {

    public static Integer lerInteiro(Scanner sc){
        while(true){
            try{
                 int inteiro=sc.nextInt();
                if(inteiro > 0) {
                    return inteiro;
                }else{
                    System.out.print("Apenas números positivos! Tente novamente: ");
                }
            } catch (InputMismatchException e){
                System.out.print("Digite apenas números inteiros! Tente novamente: ");
                sc.nextLine();
            }
        }
    }

    public static double lerDouble(Scanner sc){
        while(true){
            try{
                return sc.nextDouble();
            } catch (InputMismatchException e){
                System.out.print("Digite apenas números! Tente novamente:");
                sc.nextLine();
            }
        }
    }
}