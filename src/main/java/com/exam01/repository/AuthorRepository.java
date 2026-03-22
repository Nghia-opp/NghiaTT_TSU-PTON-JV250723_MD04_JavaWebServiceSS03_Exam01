package com.exam01.repository;

import com.exam01.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    private List<Author> authors = new ArrayList<>();

    public AuthorRepository(){
        authors.add(new Author(1, "Nguyễn Nhật Ánh", "nna@email.com"));
        authors.add(new Author(2, "Nam Cao", "namcao@email.com"));
        authors.add(new Author(3, "Tô Hoài", "tohoai@email.com"));
    }

    public List<Author> findAll() {
        return authors;
    }

    public void save(Author author) {
        authors.add(author);
    }
}
