package com.echostream.orangebot.exception;

public class ForbiddenException extends RuntimeException{

    public ForbiddenException(){
    }

    public ForbiddenException(String msg){
        super(msg);
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new ForbiddenException(message);
        }
    }

}
