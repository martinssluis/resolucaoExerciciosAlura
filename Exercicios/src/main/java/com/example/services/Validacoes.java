package com.example.services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacoes {

    public static int lerInteiro(Scanner sc){
        while(true){
            try{
                if(sc.nextInt() >0 ) {
                    return sc.nextInt();
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
