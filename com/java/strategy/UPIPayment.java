package com.java.strategy;

public class UPIPayment implements Payment{
    @Override
        public void pay(long amount){
            System.out.println("Doing UPI payment of: "+amount+" Rs");
        }
}
