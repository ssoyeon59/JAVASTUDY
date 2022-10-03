package com.sparta.week01.person;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본생성자를 대신 생성해줍니다.
@Entity // 테이블임을 나타냅니다.
public class Person {
    /**멤버변수 3개이상 (name, age, address)
     * 멤버변수는 모두 private
     * Gettor, Settor를 만든다
     * PersonConroller를 만들고 localhost:8080/myinfo에 나의 정보가 출력되도록한다
     * Person.java, PersonContoller.java를 제출한다
     */
    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String address;


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //Gettor
    public Long getId() {
        return id;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

     /**
    //Settor
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
    }

    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
    }
}
