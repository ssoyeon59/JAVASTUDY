package com.sparta.week01.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의미가 분명히 드러납니다.
    public String title;
    public String tutor;
    public int days;

    public Course() {

    }

    public Course(String title, String tutor, int days) { //생성자
        // this는 생성될 인스턴스의 속성을 파라미터로 할당하기 위한 키워드
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }
}
