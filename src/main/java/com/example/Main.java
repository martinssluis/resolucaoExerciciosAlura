package com.example;

import com.example.exceptions.SenhaInvalidaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira sua nova senha para ser cadastrada: ");
        try{ String senha = sc.nextLine(); if(senha.length() <8){ throw new SenhaInvalidaException("Sua senha deve conter pelo menos 8 caracteres");}}catch (SenhaInvalidaException e){
            System.out.println("Sua senha não atende aos requisitos minimos! "+ e.getMessage());
        }
    }
    }
