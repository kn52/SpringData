package com.rabbitmq.service;

import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;

public interface IStudentService {

    Response addStudent(Request request);

    Response getAllStudent();

    Response getStudent(long student_id);
}
