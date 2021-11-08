package com.lab1.domain.paymentBridge;

public class DollarBill extends Bill {
    private int sum;

    public DollarBill(int sum, PaymentMethod paymentMethod) {
        super(paymentMethod);
        this.sum = sum / 18;
    }

    public void payBill() {
        paymentMethod.pay(Integer.toString(sum) + " dollars");
    }
}
