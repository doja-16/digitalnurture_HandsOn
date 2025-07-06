package com.example.library;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
}
