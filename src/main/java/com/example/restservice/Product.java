package com.example.restservice;


public class Product {

    private int id;
    private double price;
    private String name;

    public Product(int id, double price, String name) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}