package com.example.entites;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }

    public void abanarRabo(){
        System.out.printf("%s abanou rabo\n", nome);
    }
}
