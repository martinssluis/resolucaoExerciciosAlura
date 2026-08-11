package com.example.entities;

import com.example.dto.EditoraDTO;

public class Editora {

    private String nome;
    private int anoFundacao;

    public Editora(String nome, int anoFundacao) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
    }

    public Editora(EditoraDTO editoraDTO){
        this.nome = editoraDTO.nome();
        this.anoFundacao = Integer.valueOf(editoraDTO.fundacao());
    }

    @Override
    public String toString() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", anoFundacao=" + anoFundacao +
                '}';
    }
}
