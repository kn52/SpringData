package com.rabbitmq.controller;

import com.rabbitmq.rabbitmq.impl.RabbitMQSender;
import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;
import com.rabbitmq.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    private ResponseEntity<Response> addStudent(@Valid @RequestBody Request request) {
        Response response=studentService.addStudent(request);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    private ResponseEntity<Response> getAllStudents(){
        Response response=studentService.getAllStudent();
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    private ResponseEntity<Response> getStudent(@RequestParam(value="studentid") long student_id){
        Response response=studentService.getStudent(student_id);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
