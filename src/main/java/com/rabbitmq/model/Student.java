package com.rabbitmq.model;

import com.rabbitmq.request.Request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "ID")
    public Long id;

    @Column(name = "NAME")
    public String name;

    @Column(name = "EMAIL")
    public String email;

    @Column(name = "COURSE")
    public String course;

    @Column(name = "COURSE_DURATION")
    public String course_duration;

    @Column(name = "SEMESTER")
    public String semester;

    @Column(name = "YEAR_OF_PASSING")
    public String year_of_passing;

    @Column(name = "ADDRESS")
    public String address;

    public Student(Request request) {
        this.id = request.id;
        this.name = request.name;
        this.email = request.email;
        this.course = request.course;
        this.course_duration = request.course_duration;
        this.semester = request.semester;
        this.year_of_passing = request.year_of_passing;
        this.address = request.address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() { return email; }

    public String getCourse() {
        return course;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public String getSemester() {
        return semester;
    }

    public String getYear_of_passing() {
        return year_of_passing;
    }

    public String getAddress() {
        return address;
    }
}
