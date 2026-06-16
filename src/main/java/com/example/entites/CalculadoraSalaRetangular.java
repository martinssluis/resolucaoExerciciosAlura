package com.example.entites;

import com.example.services.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    double altura, largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return (altura*2) + (largura*2);
    }
}
