package com.rabbitmq.exception;

public class StudentException extends RuntimeException {

    public enum ExceptionType {
        NO_STUDENT_FOUND, STUDENTS_NOT_FOUND, ALREADY_EXIST
    }

    public ExceptionType exceptionType;
    public String errorMessage;

    public StudentException(String errorMessage, ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
        this.errorMessage = errorMessage;
    }
}
