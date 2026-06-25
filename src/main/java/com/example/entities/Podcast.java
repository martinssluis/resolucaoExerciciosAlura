package com.example.entities;

public class Podcast extends Audio{

    private String apresentador, descicao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas()>500){
            return 10;
        }else{
            return 8;
        }
    }
}
