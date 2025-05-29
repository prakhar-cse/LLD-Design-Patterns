package com.java.strategy;

public class MakePayment {

    Payment payment;

    public void SelectPayment(Payment payment){
        this.payment = payment;
    }

    public void MakePayment(long amount){
        payment.pay(amount);
    }
}
