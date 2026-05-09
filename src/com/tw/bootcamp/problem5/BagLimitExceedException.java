package com.tw.bootcamp.problem5;

public class BagLimitExceedException extends RuntimeException {
    public BagLimitExceedException(String message) {
        super(message);
    }
}
