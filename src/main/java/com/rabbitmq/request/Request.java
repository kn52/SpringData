package com.rabbitmq.request;

public class Request {

    public long id;

    public String name;

    public String email;

    public String course;

    public long course_duration;

    public long semester;

    public long year_of_passing;

    public String address;

    public Request() {
    }

    public Request(long id, String name, String email, String course, long course_duration,
                   long semester, long year_of_passing, String address) {
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
