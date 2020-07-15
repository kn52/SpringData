package com.rabbitmq.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQReceiver {

    @RabbitListener(queues = "${student.rabbitmq.queue}")
    public void Receiver(String email) {
        System.out.println("Recieved Message From RabbitMQ: " + email);
    }
}
