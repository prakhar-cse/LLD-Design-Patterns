package com.java.strategy;

public class Main {


    public static void main(String[] args){

        MakePayment payment = new MakePayment();
        payment.SelectPayment(new CashPayment());
        payment.MakePayment(25);

        payment.SelectPayment(new UPIPayment());
        payment.MakePayment(500);
    }
}
