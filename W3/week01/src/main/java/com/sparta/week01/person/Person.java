package com.sparta.week01.person;

import com.sparta.week01.controller.Course;

public class Person {
    /**멤버변수 3개이상 (name, age, address)
     * 멤버변수는 모두 private
     * Gettor, Settor를 만든다
     * PersonConroller를 만들고 localhost:8080/myinfo에 나의 정보가 출력되도록한다
     * Person.java, PersonContoller.java를 제출한다
     */

    private String name;
    private int age;
    private String address;

    //Gettor
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    //Settor
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Course course = new Course();

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());
    }
}
