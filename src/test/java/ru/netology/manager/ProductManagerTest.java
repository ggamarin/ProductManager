package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    private Product item1 = new Book(1, "Harry Potter", 100, "J.K.Rowling");
    private Product item2 = new Book(2, "The Colour of Magic", 200, "Terry Pratchett");
    private Product item3 = new Smartphone(3, "3310", 500, "Nokia");
    private Product item4 = new Smartphone(4, "Galaxy S10", 1000, "Samsung");

    @BeforeEach
    void setUp() {
        repository.save(item1);
        repository.save(item2);
        repository.save(item3);
        repository.save(item4);
    }


        @Test
        void shouldSearchByAuthor() {
            Product[] actual = manager.searchBy("J.K.Rowling");
            Product[] expected = new Product[]{item1};
            assertArrayEquals(expected, actual);
        }

        @Test
        void shouldSearchByBookName () {
            Product[] actual = manager.searchBy("The Colour of Magic");
            Product[] expected = new Product[]{item2};
            assertArrayEquals(expected, actual);
        }

        @Test
        void shouldSearchBySmartphoneName () {
            Product[] actual = manager.searchBy("3310");
            Product[] expected = new Product[]{item3};
            assertArrayEquals(expected, actual);
        }

        @Test
        void shouldSearchByManufacturer () {
            Product[] actual = manager.searchBy("Samsung");
            Product[] expected = new Product[]{item4};
            assertArrayEquals(expected, actual);
        }

        @Test
        void shouldSearchByNameNotExist () {
            ProductRepository repository = new ProductRepository();
            ProductManager manager = new ProductManager(repository);
            Product actual = repository.findById(11);
            assertNull(actual);
        }
    }
