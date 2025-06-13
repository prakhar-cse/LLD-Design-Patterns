package com.java.CircuitBreaker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class CircuitBreaker {



    public enum State {
        OPEN,
        CLOSE,
        HALF_OPEN
    }

    private final int failureThreshold;
    private final long timeoutInMillis;
    private final AtomicInteger failCount;
    private final AtomicReference<State> state;
    private final AtomicReference<LocalDateTime> lastFailureTime;

    public CircuitBreaker(int failureThreshold, long timeoutInMillis) {
        this.failureThreshold = failureThreshold;
        this.timeoutInMillis = timeoutInMillis;
        this.failCount = new AtomicInteger(0);
        this.state = new AtomicReference<>(State.CLOSE);
        this.lastFailureTime = new AtomicReference<>();
    }

    private void onSuccess(){
        failCount.set(0);
        state.set(State.CLOSE);
    }

    private void onFailure(){
        failCount.incrementAndGet();
        lastFailureTime.set(LocalDateTime.now());

        if(failCount.get() >= failureThreshold){
            state.set(State.OPEN);
        }
    }

    public State getState(){
        return state.get();
    }

    public int getFailureCount(){
        return failCount.get();
    }

    public <T> T execute(Supplier<T> operation) throws Exception{
        if(state.get() == State.OPEN){
            if(shouldAttemptReset()){
                state.set(State.HALF_OPEN);
            }else{
                throw new CircuitBreakerOpenException("Circuit is open");
            }
        }

        try {
            T result = operation.get();
            onSuccess();
            return result;
        }catch (Exception e){
            onFailure();
            throw e;
        }
    }

    private boolean shouldAttemptReset() {
        return lastFailureTime.get() != null &&
                ChronoUnit.MILLIS.between(lastFailureTime.get(), LocalDateTime.now()) >= timeoutInMillis;
    }

    public static class CircuitBreakerOpenException extends RuntimeException{
        public CircuitBreakerOpenException(String msg){
            super(msg);
        }
    }
}
