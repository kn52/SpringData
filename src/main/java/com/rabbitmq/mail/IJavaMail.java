package com.rabbitmq.mail;

import com.rabbitmq.request.Request;

public interface IJavaMail {
    boolean sendMail();

    void sendMail(Request request, String studentMessage);
}
