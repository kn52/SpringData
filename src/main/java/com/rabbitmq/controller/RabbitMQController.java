package com.rabbitmq.controller;

import com.rabbitmq.rabbitmq.impl.RabbitMQSender;
import com.rabbitmq.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/rabbitmq")
public class RabbitMQController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping(value = "/producer")
    public ResponseEntity<Response> producer(@RequestParam("email") String studentEmail) {
        Response response=rabbitMQSender.send(studentEmail);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
