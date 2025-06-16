package com.java.CircuitBreaker;

public class CircuitBreakerDemo {

    public static void main(String[] args){

        ExternalClient client = new ExternalClient();

        for(int i=0;i<25;i++){
            try {
                String result = client.CallExternalService();
                System.out.println("call "+ (i+1)+": "+ result);
            } catch (Exception e) {
                System.out.println("call "+ (i+1)+": "+ e.getMessage());
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
