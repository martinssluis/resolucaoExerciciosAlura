package com.example.entites;

public class ContaCorrente extends ContaBancaria{

    // dados que podem ser calculados a partir de outros não devem virar atributos (tarifaMensal)
    public double cobrarTarifaMensal(double tarifaMensal){
        return saldo -= tarifaMensal;
        // com o this(referenciava atributo exluido) pegavamos o valor do atributo e não valor digitado pelo usuario
    }
}
