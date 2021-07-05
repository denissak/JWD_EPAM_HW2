package com.company.sak.exception;

public class NullException extends Exception {
    public NullException() {
        super();
    }

    public NullException(String message) {
        super(message);
    }

    public NullException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullException(Throwable cause) {
        super(cause);
    }
}
