package com.java.strategy;

public class CashPayment implements Payment{
    public void pay(long amount){
        System.out.println("Doing Cash payment of: "+amount+" Rs");
    }
}
