package com.echostream.orangebot.dto.common;

import lombok.Getter;

import java.io.Serializable;

public class IResponse<T> implements Serializable {
    private static final Integer SUCCESS = 200;
    private static final Integer BAD_REQUEST = 400;
    private static final Integer UNAUTHORIZED = 401;
    private static final Integer FORBIDDEN = 403;
    private static final Integer INTERNAL_ERROR = 500;

    @Getter
    private Integer code = SUCCESS;
    @Getter
    private String msg;
    @Getter
    private T result;

    protected IResponse(Integer code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public boolean success() {
        return SUCCESS.equals(code);
    }

    public static <T> IResponse<T> success(T result) {
        return new IResponse<>(SUCCESS, "", result);
    }

    public static <T> IResponse<T> badRequest(String msg) {
        return new IResponse<>(BAD_REQUEST, msg, null);
    }


    public static <T> IResponse<T> unauthorized(String msg) {
        return new IResponse<>(UNAUTHORIZED, msg, null);
    }

    public static <T> IResponse<T> forbidden(String msg) {
        return new IResponse<>(FORBIDDEN, msg, null);
    }

    public static <T> IResponse<T> internalErr(String msg) {
        return new IResponse<>(INTERNAL_ERROR, msg, null);
    }

}