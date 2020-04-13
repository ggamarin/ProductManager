package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void shouldMatchByAuthor() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        assertEquals(true, book.matches("J.K.Rowling"));

    }

    @Test
    void shouldNotMatchByAuthor() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        assertEquals(false, book.matches("Terry Pratchett"));
    }

    @Test
    void shouldMatchByName() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        assertEquals(true, book.matches("Harry Potter"));
    }

    @Test
    void shouldNotMatchByName() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        assertEquals(false, book.matches("Watcher"));
    }

}