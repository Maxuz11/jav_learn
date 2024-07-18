package com.example.clases;

public class Card extends MetodoPago {
    private int cardNumber;

    public Card(double monto, double recarga, int cardNumber) {
        super(monto, recarga);
        this.cardNumber = cardNumber;
    }
}
