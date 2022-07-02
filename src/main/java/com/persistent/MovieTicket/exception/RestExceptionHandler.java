package com.persistent.MovieTicket.exception;

import com.persistent.MovieTicket.dtos.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest webRequest){
        return new ErrorMessage(String.valueOf(HttpStatus.NOT_FOUND), ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage handleException(ResourceNotFoundException ex, WebRequest webRequest){
        return new ErrorMessage(String.valueOf(HttpStatus.BAD_REQUEST), ex.getMessage());
    }
}
