package com.rabbitmq.exception;

public class StudentException extends RuntimeException {

    enum ExceptionType {
    }

    public ExceptionType exceptionType;
    public String errorMessage;

    public StudentException(String errorMessage, ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
        this.errorMessage = errorMessage;
    }
}
