package com.example;

import com.example.entity.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

public class Main {
    public static void main(String[] args) {

        Titulo meuTitulo = new Titulo("Carros", 5);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        var tituloJson = gson.toJson(meuTitulo);

        System.out.println(tituloJson);

    }
    }
