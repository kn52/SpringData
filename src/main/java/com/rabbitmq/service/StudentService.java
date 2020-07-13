package com.rabbitmq.service;

import com.rabbitmq.exception.StudentException;
import com.rabbitmq.model.Student;
import com.rabbitmq.repository.IStudentRepository;
import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepository studentRepository;

    @Override
    public Response addStudent(Request request) {

        Optional<Student> existingStudent=studentRepository.findById(request.id);

        if(existingStudent == null){
            throw new StudentException("Student Already Exist With this ID", StudentException.ExceptionType.ALREADY_EXIST);
        }
        Student newStudent=new Student(request);
        studentRepository.save(newStudent);
        return new Response("Student Added Sucessfully",200,newStudent.name);
    }
}
