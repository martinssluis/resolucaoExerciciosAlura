package com.example;

import com.example.entities.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //TODO: criar ArrayList de produtos
        Produto mouse = new Produto();
        mouse.setNome("Mouse");
        mouse.setPreco(65.90);
        mouse.setQuantidade(2);

        Produto teclado = new Produto();
        teclado.setNome("Teclado");
        teclado.setPreco(120.00);
        teclado.setQuantidade(1);

        ArrayList<Produto> carrinhoDeCompras = new ArrayList<>();
        carrinhoDeCompras.add(mouse);
        carrinhoDeCompras.add(teclado);
        //TODO: imprimir o tamanho da lista
        System.out.println("O tamanho do meu carrinho de compras é: " + carrinhoDeCompras.size());
        //TODO: recuperar um produto pelo íncide
        System.out.println("Segundo item no  meu carrinho de compras: " + carrinhoDeCompras.get(1));
    }
    }
