package com.exam01.controller;

import com.exam01.model.Author;
import com.exam01.service.AuthorApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorApplication authorService;

    public AuthorController(AuthorApplication authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping("/authors")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }
}
