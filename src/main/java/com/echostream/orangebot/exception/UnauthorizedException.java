package com.echostream.orangebot.exception;

public class UnauthorizedException extends RuntimeException{

    public UnauthorizedException (){
    }

    public UnauthorizedException (String msg){
        super(msg);
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new UnauthorizedException (message);
        }
    }

}
