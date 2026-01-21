package com.example.product.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // GET all products
    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAll();
    }

    // POST new product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }
}
