package com.example;

import com.example.entity.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
        listaInteiros.add(3);
        listaInteiros.add(5);
        listaInteiros.add(2);
        listaInteiros.add(6);
        listaInteiros.add(1);
        listaInteiros.add(4);
        System.out.println("Lista desordenada: " + listaInteiros);
        Collections.sort(listaInteiros);
        System.out.println("Lista ordenada: " +listaInteiros);

        Titulo ben10 = new Titulo("Ben 10");
        Titulo knd = new Titulo("KND: Turma do Bairro");
        Titulo horaDeAventura = new Titulo("Hora de Aventura");
        Titulo apenasUmShow = new Titulo("Apenas um Show");
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.addAll(List.of(ben10, knd, horaDeAventura, apenasUmShow));
        System.out.println(listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println("Lista ordenada de Titulos: " + listaTitulos);

        //List<Integer> numeros = new ArrayList<>();
        List<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);


    }
    }
