package com.sparta.week01;

import com.sparta.week01.person.Person;
import com.sparta.week01.person.PersonRepository;
import com.sparta.week01.person.PersonRequestDto;
import com.sparta.week01.person.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;
@EnableJpaAuditing
@SpringBootApplication
public class Week01Application {

    public static void main(String[] args) {
        SpringApplication.run(Week01Application.class, args);
    }


    //이부분은 console창에 어떻게 나오는 건지 보여주는 거구나 딱히 안써도 됨
//    @Bean
//    public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
//        return (args) -> {
//            personRepository.save(new Person("강소연", 27, "경기도"));
//
//            System.out.println("데이터 인쇄");
//            List<Person> courseList = personRepository.findAll();
//            for (int i=0; i<courseList.size(); i++) {
//                Person person = courseList.get(i);
//                System.out.println(person.getId());
//                System.out.println(person.getName());
//                System.out.println(person.getAge());
//                System.out.println(person.getAddress());
//            }
//
//            PersonRequestDto requestDto = new PersonRequestDto("강소연", 27, "경기도");
//            personService.update(1L, requestDto);
//            courseList = personRepository.findAll();
//            for (int i=0; i<courseList.size(); i++) {
//                Person person = courseList.get(i);
//                System.out.println(person.getId());
//                System.out.println(person.getName());
//                System.out.println(person.getAge());
//                System.out.println(person.getAddress());;
//            }
//        };
//    }
}
