package com.sparta.week01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController extends Course{

    @GetMapping("/courses")
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(35);
        course.setTutor("남병관");
        return course;
    }
    //완료하고 Week01Application을 실행시켜서 localhost:8080에 연결시켜야한다
}
