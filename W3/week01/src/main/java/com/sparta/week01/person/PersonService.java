package com.sparta.week01.person;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonService {
    private final PersonRepository PersonRepository;

    // 생성자를 통해, Service 클래스를 만들 때 꼭 Repository를 넣어주도록
    // 스프링에게 알려줌
    public PersonService(PersonRepository personRepository) {
        this.PersonRepository = personRepository;
    }

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person = PersonRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person.update(requestDto);
        return person.getId();
    }
}
