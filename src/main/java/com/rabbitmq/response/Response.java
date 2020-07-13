package com.rabbitmq.response;

public class Response {

    private String message;

    private int status;

    private Object object;

    public Response(String message, int status, Object object) {
        this.message = message;
        this.status = status;
        this.object = object;
    }
}
