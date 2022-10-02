package com.sparta.week01.controller;

public class Course {
    private String title;
    private String tutor;
    private int days;

    // Getter 멤버변수의 데이터를 가져오는 메소드
    public String getTitle() {
        return this.title;
    }
    // Getter
    public String getTutor() {
        return this.tutor;
    }
    // Getter
    public int getDays() {
        return this.days;
    }

    // Setter 멤버변수에 데이터를 할당하는 메소드
    public void setTitle(String title) {
        this.title = title;
    }
    // Setter
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    // Setter
    public void setDays(int days) {
        this.days = days;
    }

    public static void main(String[] args) {
        Course course = new Course();

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        course.setTitle("웹개발의 봄 스프링");
        course.setTutor("남병관");
        course.setDays(35);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());
    }

}
