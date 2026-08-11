package com.example.entities;

import com.example.dto.LivroDTO;

public class Livro {
    private String titulo;
    private String autor;
    private Editora editora;

    public Livro(String titulo, String autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public Livro(LivroDTO livroDTO) {
        this.titulo = livroDTO.nome();
        this.autor = livroDTO.autor();
        this.editora = livroDTO.editora();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora=" + editora +
                '}';
    }
}
