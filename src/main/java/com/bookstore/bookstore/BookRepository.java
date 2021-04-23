package com.bookstore.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public List<Book> getBookByNames(List<String> bookNames);
}
