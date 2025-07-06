package com.example.library;

import java.util.Arrays;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    public List<Book> findAllBooks() {
        return Arrays.asList(
            new Book("The Alchemist", "Paulo Coelho"),
            new Book("1984", "George Orwell")
        );
    }
}
