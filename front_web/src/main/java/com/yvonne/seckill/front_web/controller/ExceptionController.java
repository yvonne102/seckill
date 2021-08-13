package com.yvonne.seckill.front_web.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Description：<描述>
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NullPointerException.class)
    public String nullPointer(){
        return "error";
    }
    @ExceptionHandler(Exception.class)
    public String exception(){
        return "error";
    }
}
