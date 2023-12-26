package com.zisheng.Handler;

import com.zisheng.Results.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(Exception.class)
    public Result<Object> exception(Exception e)
    {
        String msg = e.getMessage();
        log.error("异常信息：" + msg);
        return Result.failure(msg);
    }

}
