package com.example;

import com.example.client.GithubHttpClient;
import com.example.exceptions.ConectionErrorException;
import com.example.exceptions.UserNotFoundException;

import java.net.http.HttpClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu usuário no github: ");
        String usuario = sc.nextLine();

        HttpClient httpClient = HttpClient.newHttpClient();
        GithubHttpClient githubHttpClient = new GithubHttpClient(httpClient);

        try{
            String respostaAPI = githubHttpClient.buscarUsuario(usuario);
            System.out.println("===RESPOSTA DA API===");
            System.out.println(respostaAPI);
        }
        catch (UserNotFoundException e){System.out.println("Ops! Parece que ocorreu um erro inesperado: " +e.getMessage());}
        catch (ConectionErrorException e){System.out.println("Ops! Parece que ocorreu um erro inesperado: " +e.getMessage());}
    }
    }
