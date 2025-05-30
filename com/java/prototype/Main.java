package com.java.prototype;

public class Main {

    public static void main(String[] abc){
        DbConnectionSim db1 = new DbConnectionSim("demo",
                "testUser", "testPassword");
        System.out.println(db1.makeConnection());

        //creating new obj with same attributes
        DbConnectionSim db2 = db1.clone();
        System.out.println(db2.makeConnection());

        System.out.println(db1 == db2);
    }
}
