package com.example;

import com.example.dto.PessoaDTO;
import com.example.entities.Pessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {


        String jsonPessoa = """
                {
                    "Nome": "Luis",
                    "Idade": "23",
                    "Cidade": "Pindamonhangaba"
                }
                """;
        String jsonPessoaSemCidade = """
                {
                    "Nome": "Amanda",
                    "Idade": "25"
                }
                """;


        System.out.println("Json:" + jsonPessoa);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        PessoaDTO pessoaDTO = gson.fromJson(jsonPessoa, PessoaDTO.class);
        System.out.println(pessoaDTO);
        Pessoa pessoa = new Pessoa(pessoaDTO);
        System.out.println("Pessoa convertida: ");
        System.out.println(pessoa);

        PessoaDTO novaPessoaDTO = gson.fromJson(jsonPessoaSemCidade, PessoaDTO.class);
        System.out.println(jsonPessoaSemCidade);
        Pessoa outraPessoa = new Pessoa(novaPessoaDTO);
        System.out.println("Outra Pessoa convertida: ");
        System.out.println(outraPessoa);
    }
    }
