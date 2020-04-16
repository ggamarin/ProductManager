package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void shouldSearchByAuthor() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(1, "Harry Potter", 100, "J.K.Rowling")};
        Product[] actual = manager.searchBy("J.K.Rowling");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBookName() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(2, "The Colour of Magic", 200, "Terry Pratchett")};
        Product[] actual = manager.searchBy("Terry Pratchett");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmarthoneName() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(4, "Galaxy S10", 1000, "Samasung")};
        Product[] actual = manager.searchBy("Galaxy S10");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByManufacturer() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(3, "3310", 500, "Nokia")};
        Product[] actual = manager.searchBy("Nokia");
        assertArrayEquals(expected, actual);
    }

}