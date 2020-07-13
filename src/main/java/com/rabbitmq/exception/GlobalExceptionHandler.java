package com.rabbitmq.exception;

import com.rabbitmq.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {StudentException.class})
    private ResponseEntity<Response> globalExceptionHandler (StudentException studentException){
        return new ResponseEntity<>(
                new Response(studentException.errorMessage,101,studentException.exceptionType), HttpStatus.NOT_FOUND);
    }
}
