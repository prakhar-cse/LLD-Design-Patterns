package com.java.singleton;

public class Main {

    public static void main(String[] abc){
//        DataConfig dc = new DataConfig();
        DataConfig dc = DataConfig.getInstance();
        DataConfig dc2 = DataConfig.getInstance();

        if(dc == dc2){
            System.out.println("Same instance");
        }

    }
}
