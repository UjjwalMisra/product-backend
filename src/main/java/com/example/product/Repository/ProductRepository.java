package com.example.product.repository;

import com.example.product.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1, "Phone", 50000));
        products.add(new Product(2, "Laptop", 80000));
    }

    public List<Product> findAll() {
        return products;
    }

    public void save(Product product) {
        products.add(product);
    }
}
