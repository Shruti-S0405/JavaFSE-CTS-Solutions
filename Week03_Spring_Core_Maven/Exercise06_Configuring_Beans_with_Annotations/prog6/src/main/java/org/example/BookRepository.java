package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void displayRepository() {
        System.out.println("Inside BookRepository");
    }
}
