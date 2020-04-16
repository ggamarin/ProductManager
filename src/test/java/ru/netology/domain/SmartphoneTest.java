package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    void shouldMatchByManufacturer() {
        Smartphone smartphone = new Smartphone(3, "3310", 500, "Nokia");
        boolean actual = smartphone.matches("Nokia");
        assertTrue(actual);
    }

    @Test
    void shouldNotMatchByManufacturer() {
        Smartphone smartphone = new Smartphone(3, "3310", 500, "Nokia");
        boolean actual = smartphone.matches("Huawei");
        assertFalse(actual);
    }

    @Test
    void shouldMatchByName() {
        Smartphone smartphone = new Smartphone(33, "3310", 500, "Nokia");
        boolean actual = smartphone.matches("3310");
        assertTrue(actual);
    }

    @Test
    void shouldNotMatchByName() {
        Smartphone smartphone = new Smartphone(3, "3310", 500, "Nokia");
        boolean actual = smartphone.matches("S10");
        assertFalse(actual);
    }

}