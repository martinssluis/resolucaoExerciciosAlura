package com.example.exceptions;

public class DivisorZeroException extends RuntimeException {
    public DivisorZeroException(String message) {
        super(message);
    }

    public DivisorZeroException(String mensagem, Throwable causa){super(mensagem, causa);}
}
