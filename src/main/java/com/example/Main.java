package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter arquivo = new FileWriter("arquivo.txt");
        arquivo.write("Conteúdo a ser gravado no arquivo");
        arquivo.close();

    }
    }
