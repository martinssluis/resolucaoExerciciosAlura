package com.example;

import com.example.entities.Musica;
import com.example.entities.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();

        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
    }
}