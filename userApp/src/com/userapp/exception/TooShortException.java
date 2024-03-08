package com.userapp.exception;

public class TooShortException extends Exception {

    public TooShortException(String message) {
        super(message);
    }

    public TooShortException() {
    }
}
