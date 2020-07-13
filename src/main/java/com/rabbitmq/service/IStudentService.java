package com.rabbitmq.service;

import com.rabbitmq.request.Request;
import com.rabbitmq.response.Response;

public interface IStudentService {

    Response addStudent(Request request);
}
