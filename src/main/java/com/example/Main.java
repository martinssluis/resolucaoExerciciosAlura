package com.example;

import com.example.dto.EditoraDTO;
import com.example.dto.LivroDTO;
import com.example.dto.PessoaDTO;
import com.example.entities.Editora;
import com.example.entities.Livro;
import com.example.entities.Pessoa;
import com.google.gson.*;

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

        String livroQueEstouLendo = """
                {
                    "Nome": "Hipotese do Amor",
                    "Autor": "Ali Hazelwood",
                    "Editora": {
                        "Nome": "Arqueiro",
                        "Fundacao": "2011"
                    } 
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

        System.out.println(jsonPessoaSemCidade);
        PessoaDTO novaPessoaDTO = gson.fromJson(jsonPessoaSemCidade, PessoaDTO.class);
        Pessoa outraPessoa = new Pessoa(novaPessoaDTO);
        System.out.println("Outra Pessoa convertida: ");
        System.out.println(outraPessoa);


        System.out.println(livroQueEstouLendo);
        LivroDTO livroDTO = gson.fromJson(livroQueEstouLendo, LivroDTO.class);
        System.out.println(livroDTO);
        Livro meuLivro = new Livro(livroDTO);
        System.out.println("Meu Livro: " + meuLivro);

        JsonElement element = JsonParser.parseString(livroQueEstouLendo);
        JsonObject jsonLivro = element.getAsJsonObject();
        JsonObject jsonEditora = jsonLivro.getAsJsonObject("Editora");

        EditoraDTO editoraArqueiro = gson.fromJson(jsonEditora, EditoraDTO.class);
        System.out.println(editoraArqueiro);
        Editora editora = new Editora(editoraArqueiro);
        System.out.println("Editora Arqueiro: " + editora);
    }
    }
