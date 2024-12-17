package com.example.entity.utils;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {
    Logger log= LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
    @ExceptionHandler({Exception.class})
    public <K> ResponseMessage <K>handlerException(Exception e,HttpServletRequest request, HttpServletResponse response){
        log.error("\n统一异常："+ LocalDateTime.now().toString()+"\n",e);
        return ResponseMessage.fail();
    }

}
