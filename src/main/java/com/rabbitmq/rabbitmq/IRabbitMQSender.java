package com.rabbitmq.rabbitmq;

import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;

public interface IRabbitMQSender {
    Response send(String email);

    void send(Request request);
}
