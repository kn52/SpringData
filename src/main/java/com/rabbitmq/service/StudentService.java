package com.rabbitmq.service;

import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Override
    public Response addStudent(Request request) {
        return null;
    }
}
