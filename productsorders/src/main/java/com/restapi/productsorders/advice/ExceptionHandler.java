package com.restapi.productsorders.advice;

import com.restapi.productsorders.Exception.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {
@ResponseStatus(HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgumentException(MethodArgumentNotValidException methodArgumentNotValidException) {
        Map<String, String> error = new HashMap<>();
        methodArgumentNotValidException.getBindingResult().getFieldErrors().forEach(err -> {
            error.put(err.getField(), err.getDefaultMessage());
        });
 return error;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(OrderNotFoundException.class)
    public Map<String, String> OrderNotFoundException(OrderNotFoundException orderNotFoundException) {
        Map<String, String> error = new HashMap<>();
        error.put("errorMessage", orderNotFoundException.getMessage());
        return error;
    }
}
