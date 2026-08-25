package com.example;

import com.example.entity.Titulo;
import com.example.entity.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

public class Main {
    public static void main(String[] args) {

        Veiculo corolla = new Veiculo("Corolla", 2019);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        var corollaJson = gson.toJson(corolla);

        System.out.println(corollaJson);

    }
    }
