package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public String getBookName() {
        return "Effective Java by Joshua Bloch";
    }
}
