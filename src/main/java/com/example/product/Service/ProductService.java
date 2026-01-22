package com.example.product.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.product.model.Product;
import com.example.product.repository.ProductJdbcRepository;

@Service
public class ProductService {

    private final ProductJdbcRepository repository;

    public ProductService(ProductJdbcRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public void addProduct(Product product) {
        repository.save(product);
    }
    public Product getProductById(int id){
        return repository.findById(id);
    }
}
