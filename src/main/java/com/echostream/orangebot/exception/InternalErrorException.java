package com.echostream.orangebot.exception;

public class InternalErrorException extends RuntimeException {

    public InternalErrorException() {
    }

    public InternalErrorException(String msg) {
        super(msg);
    }

    public InternalErrorException(Throwable cause) {
        super(cause);
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new InternalErrorException(message);
        }
    }
}
