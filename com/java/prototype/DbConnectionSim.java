package com.java.prototype;

public class DbConnectionSim {

    String baseUrl;
    String username;
    String password;

    public DbConnectionSim(String baseUrl, String username, String password){
        this.baseUrl = baseUrl;
        this.username = username;
        this.password = password;
    }

    public String makeConnection(){
        return "Created connection with user " + username;
    }

    public DbConnectionSim clone(){
        return  new DbConnectionSim(this.baseUrl, this.username, this.password);
    }
}
