package com.company.sak.exception;

public class MaxWeightException extends Exception {
    public MaxWeightException() {
        super();
    }

    public MaxWeightException(String message) {
        super(message);
    }

    public MaxWeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaxWeightException(Throwable cause) {
        super(cause);
    }
}
