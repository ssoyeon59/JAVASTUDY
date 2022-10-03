package com.sparta.week01.person;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    /**
     * @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName ("강소연");
        person.setAge (27);
        person.setAddress ("경기도");
        return person;
    }
     */

    private final PersonRepository personRepository;
    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    private final PersonService personService;

    // PostMapping을 통해서, 같은 주소라도 방식이 다름을 구분합니다.
    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        // requestDto 는, 생성 요청을 의미합니다.
        Person person = new Person(requestDto);

        // JPA를 이용하여 DB에 저장하고, 그 결과를 반환합니다.
        return personRepository.save(person);
    }

    //ID가 {id}인 강의 수정 요청
    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    //ID가 {id}인 강의를 삭제하기
    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }
}
