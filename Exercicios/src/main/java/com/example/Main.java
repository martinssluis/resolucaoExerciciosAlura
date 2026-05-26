package com.example;

import com.example.entities.*;

import java.time.LocalDate;
import java.util.Scanner;

import static com.example.services.Validacoes.lerDouble;
import static com.example.services.Validacoes.lerInteiro;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa luis = new Pessoa();
        luis.dizOlaMundo();
        Musica musicaUsuario = new Musica();
        Carro meuCarro = new Carro();
        Aluno amanda = new Aluno();
        int anoAtual = LocalDate.now().getYear();
        System.out.println(anoAtual);

        Calculadora calculo = new Calculadora();

        System.out.println(calculo.retornaDobro(2.5));


        //Musica
        System.out.print("Informe o título da música:");
        musicaUsuario.setTitulo(sc.nextLine());
        System.out.print("Informe o artista:");
        musicaUsuario.setArtista(sc.nextLine());
        System.out.print("Informe o ano de lançamento:");
        musicaUsuario.setAnoLancamento(lerInteiro(sc));
        System.out.print("Avalie a música:");
        musicaUsuario.avaliarMusica();
        System.out.print("Avalie a música:");
        musicaUsuario.avaliarMusica();

        double mediaAvaliacoes = musicaUsuario.mediaAvaliacoes();
        System.out.println(mediaAvaliacoes);
        musicaUsuario.ficaTechnica();
        //Limpar o buffer
        sc.nextLine();

        //Carro
        System.out.print("Informe o modelo do carro:");
        meuCarro.setModelo(sc.nextLine());
        System.out.print("Informe o ano do carro:");
        meuCarro.setAno(lerInteiro(sc));
        System.out.print("Informe a cor do carro: ");
        meuCarro.setCor(sc.nextLine());
        int idadeCarro = anoAtual - meuCarro.getAno();
        System.out.print("A 'idade' do carro é: " + idadeCarro + " anos");
        meuCarro.ficaTechnica();
        sc.nextLine();

        //Aluno
        System.out.print("Informe o nome do aluno: ");
        amanda.setNome(sc.nextLine());
        System.out.print("Informe a idade do aluno: ");
        amanda.setIdade(lerInteiro(sc));
        amanda.exibirInformacoes();
    }
    }
