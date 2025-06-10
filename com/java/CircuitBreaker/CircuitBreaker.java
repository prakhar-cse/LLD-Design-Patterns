package com.java.CircuitBreaker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

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

}
