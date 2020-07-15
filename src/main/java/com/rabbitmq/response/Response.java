package com.rabbitmq.response;

public class Response {

    public String message;

    public int status;

    public Object response;

    public Response() {
    }

    public Response(String message, int status, Object response) {
        this.message = message;
        this.status = status;
        this.response = response;
    }
}
