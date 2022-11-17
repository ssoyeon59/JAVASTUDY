package com.example.demo.controller;

import com.example.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostRepository postRepository;

    @GetMapping("/api/posts")
    public getPosts() {
        return postRepository.findAll();
    }
}
