package com.sparta.week01.prac;

public class Tutor {

    //1. 이름(name)과 경력(bio) 멤버 변수를 추가하세요
    //2. 각 변수를 private으로 선언하고 Getter와 Setter를 만들어보세요
    //3. 마지막으로 기본생성자와 name/bio입력받는 생성자 두개를 반들어보세요

    private String name; //private 와 public의 차이를 정리하자
    private String bio;

    public Tutor() {//기본생성자 (왜 이렇게 생성하는 거지?)

    }

    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
