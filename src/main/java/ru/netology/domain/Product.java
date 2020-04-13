package ru.netology.domain;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean matches(String search) {
        Product product = new Product();
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (product instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) product;
                if (smartphone.getName().equalsIgnoreCase(search)) {
                    return true;
                }
                return true;
            }
        }
        return false;
    }
}
