package com.example.restservice;

import com.example.restservice.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("api/product/items")
public class ProductController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    ProductFactory pf = new ProductFactory();


    @GetMapping
    public ResponseEntity<List<Product>> getAll() {

        List<Product> products = pf.getProductList();
        return ResponseEntity.ok().body(products);

    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {

        Product created = pf.addProduct(product);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(product.getId())
                .toUri();
        return ResponseEntity.created(location).body(created);
    }
}
