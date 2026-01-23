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

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();   // FIXED
    }
    @GetMapping("/category/{categoryName}")
    public List<Product> getProductsByCategory(
            @PathVariable String categoryName) {

        return service.getProductsByCategory(categoryName);
    }


    @PostMapping
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);       // FIXED
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }
}
