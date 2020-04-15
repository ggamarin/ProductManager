package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void shouldMatchByAuthor() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        boolean actual = book.matches("J.K.Rowling");
        assertTrue(actual);

    }

    @Test
    void shouldNotMatchByAuthor() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        boolean actual = book.matches("Tolstoy");
        assertFalse(actual);
    }

    @Test
    void shouldMatchByName() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        boolean actual = book.matches("Harry Potter");
        assertTrue(actual);
    }

    @Test
    void shouldNotMatchByName() {
        Book book = new Book(1, "Harry Potter", 100, "J.K.Rowling");
        boolean actual = book.matches("LOTR");
        assertFalse(actual);
    }

}