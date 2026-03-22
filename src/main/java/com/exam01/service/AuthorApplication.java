package com.exam01.service;

import com.exam01.model.Author;
import com.exam01.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorApplication {
    private final AuthorRepository authorRepository;

    public AuthorApplication(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        authorRepository.save(author);
        return author;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
