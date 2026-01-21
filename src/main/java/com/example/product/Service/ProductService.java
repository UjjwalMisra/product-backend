package com.example.product.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product save(Product product) {
        return repository.save(product);
    }
}
