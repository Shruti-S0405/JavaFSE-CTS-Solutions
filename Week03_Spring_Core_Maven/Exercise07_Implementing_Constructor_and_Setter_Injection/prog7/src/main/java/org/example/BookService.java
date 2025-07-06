package org.example;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // Constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("BookService [" + serviceName + "]: Adding book - " + bookName);
        bookRepository.save(bookName);
    }
}
