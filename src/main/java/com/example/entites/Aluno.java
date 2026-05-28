package com.example.entites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {
    private String nome;
    //Boa prática para evitar NullPointerException (quando o programa tenta acessar ou modificar um objeto que não existe ou não foi inicializado na memória)
    private final List<Double> notas = new ArrayList<>(); // ao usarmos o new ArrayList, a lista nunca será null
    // com o final notas sempre será essa Lista de Doubles

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public List<Double> getNotas() {return Collections.unmodifiableList(notas); } // só poderá receber a nota, sem manipulações fora da classe

    //Adiciona notas na lista
    public void adicionaNota(double nota) {
        if (nota < 0.0 || nota > 10.0){
            throw new IllegalArgumentException("As notas devem ser de 0.0 a 10.0");
        }
        this.notas.add(nota);
    }

    public double mediaNotas() {
        return notas.stream()
                .mapToDouble(nota -> nota) // lambda function que converte o item da lista, que é um Double , para double primitivo
                .average() // calcula media automaticamente
                .orElse(0.0); // se estiver vazia, retorna zero
    }
}
