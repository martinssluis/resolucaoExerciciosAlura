package com.example;

import com.example.dto.PessoaDTO;
import com.example.entities.Pessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {


        String json = """
                {
                    "Nome": "Luis",
                    "Idade": "23",
                    "Cidade": "Pindamonhangaba"
                }
                """;

        System.out.println("Json:" + json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        PessoaDTO pessoaDTO = gson.fromJson(json, PessoaDTO.class);
        System.out.println(pessoaDTO);
        Pessoa pessoa = new Pessoa(pessoaDTO);
        System.out.println("Pessoa convertida: ");
        System.out.println(pessoa);
    }
    }
