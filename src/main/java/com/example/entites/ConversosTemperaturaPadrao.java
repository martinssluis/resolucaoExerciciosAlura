package com.example.entites;

import com.example.services.ConversorTemperatura;


public class ConversosTemperaturaPadrao implements ConversorTemperatura {

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void celsiusParaFahrenheit() {
        System.out.println((this.temperatura * 9/5) + 32 + "ºF");

    }
    @Override
    public void fahrenheitParaCelsius() {
        System.out.println((this.temperatura - 32) * 5/9 + "ºC");
    }
}
