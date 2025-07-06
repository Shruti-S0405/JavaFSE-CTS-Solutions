package org.example;

public class BookService {
    private BookRepository bookRepository;

    public void addBook(String bookName) {
        System.out.println("Adding book: " + bookName);
        bookRepository.save(bookName);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
