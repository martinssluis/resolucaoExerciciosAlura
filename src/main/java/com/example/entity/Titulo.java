package com.example.entity;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(@org.jetbrains.annotations.NotNull Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
