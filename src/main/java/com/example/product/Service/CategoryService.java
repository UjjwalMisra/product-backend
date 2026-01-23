package com.example.product.service;

import com.example.product.model.Category;
import com.example.product.repository.CategoryJdbcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryJdbcRepository repository;

    public CategoryService(CategoryJdbcRepository repository) {
        this.repository = repository;
    }
    public List<Category> getAllCategory() {
        return repository.findAll();
    }
    public void addCategory(Category category) {
        repository.save(category);
    }
}
