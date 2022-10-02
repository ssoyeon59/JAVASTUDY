package com.sparta.week01.prac;

public class Prac {

    /**public static void main(String[] args) {
        System.out.println("안녕, 스파르타!");

        Course course = new Course();
        System.out.println(course.title);
        System.out.println(course.tutor);
        System.out.println(course.days);

        Course course2 = new Course("웹개발의 봄 스프링", "남병관", 35);
        System.out.println(course2.title);
        System.out.println(course2.tutor);
        System.out.println(course2.days);
    }*/

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = sum(1, 2);
        System.out.println(result);

    }
}
