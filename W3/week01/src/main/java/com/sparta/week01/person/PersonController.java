package com.sparta.week01.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController extends Person{

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName ("강소연");
        person.setAge (27);
        person.setAddress ("경기도");
        return person;
    }
}
