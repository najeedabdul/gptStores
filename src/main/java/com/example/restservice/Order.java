package com.example.restservice;

import java.util.List;

public class Order {

    private List<Product> products;
    private double totalPrice;

    public Order(List<Product> products) {
        this.setProducts(products);
        double tempTotalPrice = 0;
        for (Product p : products)
        {
            tempTotalPrice = tempTotalPrice + p.getPrice();
        }
        this.setTotalPrice(tempTotalPrice);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}