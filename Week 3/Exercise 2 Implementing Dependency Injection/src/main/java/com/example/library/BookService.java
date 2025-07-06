package com.example.library;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        for (Book book : bookRepository.findAllBooks()) {
            System.out.println(book);
        }
    }
}
