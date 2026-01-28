package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductJdbcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductJdbcRepository repository;

    public ProductService(ProductJdbcRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public List<Product> getProductsByCategory(String categoryName) {
        return repository.findByCategoryName(categoryName);
    }

    public String getCategoryByProductId(int productId) {
        return repository.findCategoryByProductId(productId);
    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public Product getProductById(int id) {
        return repository.findById(id);
    }
}
