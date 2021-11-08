package com.lab1.domain.paymentBridge;

public class Card implements PaymentMethod {
    @Override
    public void pay(String sum) {
        System.out.println("Client paid " + sum + " with card");
    }
}
