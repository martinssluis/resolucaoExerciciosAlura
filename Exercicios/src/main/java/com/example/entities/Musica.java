package com.example.entities;

import lombok.*;
import java.util.Scanner;

import static com.example.services.Validacoes.lerDouble;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes = 0;

    Scanner sc = new Scanner(System.in);

    public void avaliarMusica(){
        avaliacao += lerDouble(sc);
        numAvaliacoes ++;
    }


    public void ficaTechnica(){
        System.out.print(String.format(
                        """
                        Título:                 %s
                        Artista:                %s
                        Ano de Lançamento:      %d
                        Avaliação:              %.2f
                        Número de Avaliações:   %d
                        """,  titulo, artista, anoLancamento, avaliacao, numAvaliacoes
                ));
    }

    public double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }
}
