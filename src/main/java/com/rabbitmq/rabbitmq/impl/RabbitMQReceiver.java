package com.rabbitmq.rabbitmq.impl;

import com.rabbitmq.mail.impl.JavaMail;
import com.rabbitmq.rabbitmq.IRabbitMQReceiver;
import com.rabbitmq.request.Request;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQReceiver implements IRabbitMQReceiver {

    @Autowired
    JavaMail javaMail;

    @Override
    @RabbitListener(queues = "${student.rabbitmq.queue}")
    public void Receiver(String email) {
        System.out.println("Recieved Message From RabbitMQ: " + email);
    }

    @Override
    @RabbitListener(queues = "${student.rabbitmq.queue}")
    public void Receiver(Request request) {
        System.out.println("Student Registered Successfully With Given Email: "+ request.email);
    }
}
