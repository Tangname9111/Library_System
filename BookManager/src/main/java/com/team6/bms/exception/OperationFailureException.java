package com.team6.bms.exception;

public class OperationFailureException extends RuntimeException {
    public OperationFailureException() {
    }

    public OperationFailureException(String message) {
        super(message);
    }
}
