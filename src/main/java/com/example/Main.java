package com.example;

import com.example.entities.Produto;
import com.example.entities.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //TODO: criar ArrayList de produtos
        Produto mouse = new Produto("Mouse", 65.90, 2);

        Produto teclado = new Produto("Teclado", 120.0, 1);

        ArrayList<Produto> carrinhoDeCompras = new ArrayList<>();
        carrinhoDeCompras.add(mouse);
        carrinhoDeCompras.add(teclado);
        //TODO: imprimir o tamanho da lista
        System.out.println("O tamanho do meu carrinho de compras é: " + carrinhoDeCompras.size());
        //TODO: recuperar um produto pelo íncide
        System.out.println("Segundo item no  meu carrinho de compras: " + carrinhoDeCompras.get(1));

        ProdutoPerecivel banana = new ProdutoPerecivel("Cacho de banana", 7.99,1);
        banana.setDataValidade(new Date());
        System.out.println(banana.toString());
    }
    }
