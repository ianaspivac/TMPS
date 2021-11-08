package com.lab1.domain.paymentBridge;

public abstract class Bill {
    protected PaymentMethod paymentMethod;

    protected Bill(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public abstract void payBill();
}
