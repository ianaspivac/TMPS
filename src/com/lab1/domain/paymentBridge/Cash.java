package com.lab1.domain.paymentBridge;

public class Cash implements PaymentMethod {
    @Override
    public void pay(String sum) {
        System.out.println("Client paid " + sum + " with cash");
    }
}