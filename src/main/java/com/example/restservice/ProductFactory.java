package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

    List<Product> products;

    ProductFactory() {
        products = new ArrayList<Product>();
        products.add(new Product(1,12.04, "Pokeman backpack"));
        products.add(new Product(2,12.04, "Star Wars backpack"));
        products.add(new Product(3,12.04, "Mickey Mouse backpack"));
        products.add(new Product(4,12.04, "Goofy Backpack"));
        products.add(new Product(5,12.04, "Donald Backpack"));
        products.add(new Product(6,12.04, "Minnie Backpack"));
        products.add(new Product(7,12.04, "USA Flag Backpack"));
    }



    public List<Product> getProductList()
    {
         return products;
    }

    public Product addProduct(Product product)
    {
        products.add(product);
        return product;
    }


}

