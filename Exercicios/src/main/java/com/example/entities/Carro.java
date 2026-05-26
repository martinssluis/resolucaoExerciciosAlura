package com.example.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Carro {

    public String modelo;
    public int ano;
    public String cor;


    public void ficaTechnica(){
        System.out.print(String.format(
                """
                Modelo:                 %s
                Ano:                    %d
                Cor:                    %s
                """,  modelo, ano, cor
        ));
    }
}
