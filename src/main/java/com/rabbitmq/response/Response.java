package com.rabbitmq.response;

public class Response {

    private String message;

    private String status;

    private Object object;

    public Response(String message, String status, Object object) {
        this.message = message;
        this.status = status;
        this.object = object;
    }
}
