package com.lab1.domain.paymentBridge;

public class LeiBill extends Bill {
    private int sum;

    public LeiBill(int sum, PaymentMethod paymentMethod) {
        super(paymentMethod);
        this.sum = sum;
    }
    public void payBill() {
        paymentMethod.pay(Integer.toString(sum) + " lei");
    }
}
