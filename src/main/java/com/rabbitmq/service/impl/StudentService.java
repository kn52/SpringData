package com.rabbitmq.service.impl;

import com.rabbitmq.exception.StudentException;
import com.rabbitmq.model.Student;
import com.rabbitmq.rabbitmq.impl.RabbitMQSender;
import com.rabbitmq.repository.IStudentRepository;
import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;
import com.rabbitmq.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    @Autowired
    RabbitMQSender rabbitMQSender;

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
        rabbitMQSender.send(request);
        return new Response("Student Added Sucessfully", 200, newStudent.name);
    }

    @Override
    public Response getAllStudent() {
        List<Student> allStudents = studentRepository.findAll();
        if(allStudents !=null){
            throw new StudentException("No Student Found", StudentException.ExceptionType.STUDENTS_NOT_FOUND);
        }
        return new Response("Students Found Successfully",200,allStudents);
    }

    @Override
    public Response getStudent(long student_id) {
        Optional<Student> student=studentRepository.findById(student_id);
        if(student.isPresent()){
            return new Response("Student Found",200,student.get());
        }
        throw new StudentException("No Student Found", StudentException.ExceptionType.NO_STUDENT_FOUND);
    }
}
