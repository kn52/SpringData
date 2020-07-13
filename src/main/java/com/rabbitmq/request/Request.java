package com.rabbitmq.request;

public class Request {

    public Long id;

    public String name;

    public String email;

    public String course;

    public String course_duration;

    public String semester;

    public String year_of_passing;

    public String address;

    public Request(Long id, String name, String email, String course, String course_duration,
                    String semester, String year_of_passing, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.course_duration = course_duration;
        this.semester = semester;
        this.year_of_passing = year_of_passing;
        this.address = address;
    }
}
