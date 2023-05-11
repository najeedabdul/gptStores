package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private CartController cartController;

    @PostMapping
    public ResponseEntity<Order> placeOrder() {
        List<Product> products = cartController.getCart();
        Order order = new Order(products);
        return ResponseEntity.ok().body(order);
    }

}
