package com.rabbitmq.rabbitmq;

import com.rabbitmq.request.Request;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface IRabbitMQReceiver {
    @RabbitListener(queues = "${student.rabbitmq.queue}")
    void Receiver(String email);

    @RabbitListener(queues = "${student.rabbitmq.queue}")
    void Receiver(Request request);
}
