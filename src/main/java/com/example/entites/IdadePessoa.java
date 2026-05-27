package com.example.entites;

import java.time.LocalDate;

public class IdadePessoa {
    private String nome;
    // impede que anoNascimento seja alterado, já que ele é algo que nunca muda
    private final Integer anoNascimento;

    // construtor com validações
    public IdadePessoa(String nome, Integer anoNascimento) {

        this.anoNascimento = anoNascimentoValido(anoNascimento);
        this.nome = nome;
    }

    // metodo auxiliar para pegar o ano atual / ajuda a evitar boilerplate
    private Integer getAnoAtualDoSistema(){ return LocalDate.now().getYear();}

    // metodo auxiliar para permitir apenas anos de nascimento válidos
    private Integer anoNascimentoValido(Integer anoNascimento){
        // não permite anoNascimento nulo
        if (anoNascimento == null){
            throw new IllegalArgumentException("O ano de nascimento não pode ser nulo");
        }

        // não permite anoNascimento muito antigo
        if (anoNascimento < 1908){
            throw new IllegalArgumentException("Ano inválido! A pessoa mais velha do mundo vida em 2026 seguindo o Guiness Book é Tomiko Itooka");
        }

        // não permite a pessoa nascer no futuro
        if (anoNascimento > getAnoAtualDoSistema()){
            throw new IllegalArgumentException("Não é possível nascer no futuro!");
        }
        return anoNascimento;
    }

    // GETTERS E SETTERS

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Integer getAnoNascimento() {return anoNascimento;}

    // fazer validações (pessoa só pode ter um ano de nascimento, não pode ser maior que o ano atual, se for menor que 1909 ela seria a pessoa mais velja do mundo - fazer piada que ela deveria estar no guinessbook)

    // não coloquei idade como atributo, pois o Java faria esse cálculo uma vez e a tornaria "estática"
    // dados que podem ser calculados a partir de outros não devem virar variáveis de estado (atributos)
    public Integer getIdade() {return getAnoAtualDoSistema() - this.anoNascimento;}


    // o contrutor já barra anos futuros, então a idade nunca será menor ou igual a 0, deixando o metodo mais simples
    public boolean maiorDeIdade(){return getIdade() >= 18;}
}
