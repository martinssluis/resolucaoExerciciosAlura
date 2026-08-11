package com.example.entities;

import com.example.dto.PessoaDTO;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Pessoa(PessoaDTO pessoaDTO) {
        this.nome = pessoaDTO.nome();
        this.idade = pessoaDTO.idade();
        this.cidade = pessoaDTO.cidade();
    }

    @Override
    public String toString() {
        return "nome=" + nome + '\'' +
                ", idade=" + idade + "," +
                "cidade= " + cidade;
    }


}
