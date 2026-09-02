package com.example.entity;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void resumoDoLivro(){
        System.out.println(this.titulo + " de " + this.autor + " com " + this.paginas + " páginas");
    }
}
