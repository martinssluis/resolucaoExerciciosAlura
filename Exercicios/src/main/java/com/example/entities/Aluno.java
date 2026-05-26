package com.example.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluno {

    public String nome;
    public int idade;

    public void exibirInformacoes() {
        System.out.print(String.format(
                """
                        Nome:                       %s
                        Idade:                      %d
                        """, nome, idade
        ));
    }
}
