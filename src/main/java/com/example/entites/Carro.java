package com.example.entites;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Carro {

    private String nome;
    private Map<Integer,Double> precoPorAno = new HashMap<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoPorAno(Integer ano){
        return precoPorAno.get(ano);
    }

    public void setPrecoPorAno(Integer ano, Double preco)
    {
        this.precoPorAno.put(ano, preco);
    }


    public Double precoMedioParaCadaAno(){
        Double precoTotal = 0.0;
        for (Double preco : precoPorAno.values()) {precoTotal += preco;}
        return precoTotal / precoPorAno.size(); }

    public double menorPreco(){
        return Collections.min(precoPorAno.values());
    }
    public double maiorPreco(){
        return Collections.max(precoPorAno.values());
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        for (Map.Entry<Integer, Double> entry : precoPorAno.entrySet()) {
            System.out.printf("Ano %d: R$ %.2f%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Menor preço: " + menorPreco());
        System.out.println("Maior preço: " + maiorPreco());
        System.out.println("Média de preço: " + precoMedioParaCadaAno());
    }
}
