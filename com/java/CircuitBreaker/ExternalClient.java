package com.java.CircuitBreaker;

public class ExternalClient {
    private final CircuitBreaker circuitBreaker;

    public ExternalClient() {
        this.circuitBreaker = new CircuitBreaker(5, 6000);
    }

    public String CallExternalService() throws Exception{
        return circuitBreaker.execute( ()->{
            if(Math.random() >0.7){
                return "success";
            }else{
                throw new RuntimeException("service unavaiable");
            }
        });
    }
}
