package com.example.entites;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    //Boa prática para evitar NullPointerException (quando o programa tenta acessar ou modificar um objeto que não existe ou não foi inicializado na memória)
    private List<Double> notas = new ArrayList<Double>(); // ao usarmos o new ArrayList, a lista nunca será null

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    //Adiciona notas na lista
    public void adicionaNota(double nota) {
        this.notas.add(nota);
    }

    public double mediaNotas(){
        if(notas.isEmpty()){
            return 0.0;
        }

        // o stream seria um metodo que nos permite manipular a list, que é algo engessado e genérico
        //mapToDouble é para especificar a saída que esperamos da nossa lista que  contem Doubles
        // o Double::doubleValue é para converter o Objeto/Classe Double para um tipo primitivo que o computador consegue entender
        double soma = notas.stream().mapToDouble(Double::doubleValue).sum();
        return soma  / notas.size();
    }
}
