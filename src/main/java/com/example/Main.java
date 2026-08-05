package com.example;

import java.util.ArrayList;
import java.util.Collections;

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

    }
    }
