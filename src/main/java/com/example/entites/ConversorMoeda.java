package com.example.entites;

import com.example.services.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {


    @Override
    public double converterDolarParaReal(double valor) {
        return valor * 5;
    }
}
