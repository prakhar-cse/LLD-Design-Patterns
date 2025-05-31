package com.java.singleton;

public class DataConfig {

    private static DataConfig instance;

    private DataConfig(){
        System.out.println("Instance of DataConfig is created");
    }

    public static DataConfig getInstance(){
        if(instance == null){
            instance =  new DataConfig();
        }
            return instance;
    }
}
