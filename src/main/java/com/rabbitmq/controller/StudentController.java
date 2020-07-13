package com.rabbitmq.controller;

import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;
import com.rabbitmq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    private ResponseEntity<Response> addStudent(@RequestBody Request request) {
        Response response=studentService.addStudent(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
