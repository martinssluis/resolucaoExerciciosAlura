package com.example.entites;

public class Gato extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Miau Miau");
    }

    public void arranharMOveis(){
        System.out.printf("%s arranhou os móveis\n", nome);
    }
}
