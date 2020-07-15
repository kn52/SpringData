package com.rabbitmq.rabbitmq;

import com.rabbitmq.response.Response;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender implements IRabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${student.rabbitmq.exchange}")
    private String exchange;

    @Value("${student.rabbitmq.routingkey}")
    private String routingkey;

    public Response send(String email) {
        rabbitTemplate.convertAndSend(exchange, routingkey, email);
        return new Response("Message sent Successfully",200,"");
    }
}
