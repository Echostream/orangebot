package com.echostream.orangebot.filter;

import com.echostream.orangebot.dto.common.IResponse;
import com.echostream.orangebot.exception.ForbiddenException;
import com.echostream.orangebot.exception.InternalErrorException;
import com.echostream.orangebot.exception.UnauthorizedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {IllegalArgumentException.class,IllegalStateException.class})
    public IResponse badRequestHandler(HttpServletResponse response, Exception e) {
        log.error("error: {}", e.getMessage());
        e.printStackTrace();
        response.setHeader("requestFailed", "true");
        response.setHeader("reason", "unauthorized");
        return IResponse.internalErr("授权未通过: " + e.getMessage());
    }


    @ExceptionHandler(value = UnauthorizedException.class)
    public IResponse unauthorizedHandler(HttpServletResponse response, Exception e) {
        log.error("error: {}", e.getMessage());
        e.printStackTrace();
        response.setHeader("requestFailed", "true");
        response.setHeader("reason", "unauthorized");
        return IResponse.internalErr("授权未通过: " + e.getMessage());
    }

    @ExceptionHandler(value = ForbiddenException.class)
    public IResponse forbiddenHandler(HttpServletResponse response, Exception e) {
        log.error("error: {}", e.getMessage());
        e.printStackTrace();
        response.setHeader("requestFailed", "true");
        response.setHeader("reason", "forbidden");
        return IResponse.internalErr("禁止访问: " + e.getMessage());
    }

    @ExceptionHandler(value = InternalErrorException.class)
    public IResponse internalErrorHandler(HttpServletResponse response, Exception e) {
        log.error("error: {}", e.getMessage());
        e.printStackTrace();
        response.setHeader("requestFailed", "true");
        response.setHeader("reason", "internal error");
        return IResponse.internalErr("内部服务器错误: " + e.getMessage());
    }

}
