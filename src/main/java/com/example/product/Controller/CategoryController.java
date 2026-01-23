package com.example.product.controller;

import com.example.product.model.Category;
import com.example.product.model.Product;
import com.example.product.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public void addCategory(@RequestBody Category category) {
        service.addCategory(category);
    }
    @GetMapping
    public List<Category> getAllCategory() {
        return service.getAllCategory();   // FIXED
    }

}
