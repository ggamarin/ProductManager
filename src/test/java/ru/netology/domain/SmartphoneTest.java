package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    void shouldMatchByManufacturer() {
        Smartphone smartphone = new Smartphone(3, "3310", 500, "Nokia");
        assertEquals(true, smartphone.matches("Nokia"));
    }

    @Test
    void shouldNotMatchByManufacturer() {
        Smartphone smartphone = new Smartphone(3, "3310", 500, "Nokia");
        assertEquals(false, smartphone.matches("Samsung"));
    }

    @Test
    void shouldMatchByName() {
        Smartphone smartphone = new Smartphone(33, "3310", 500, "Nokia");
        assertEquals(true, smartphone.matches("3310"));
    }

    @Test
    void shouldNotMatchByName() {
        Smartphone smartphone = new Smartphone(3, "3310", 500, "Nokia");
        assertEquals(false, smartphone.matches("Galaxy S10"));
    }

}