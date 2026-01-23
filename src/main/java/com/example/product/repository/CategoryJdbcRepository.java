package com.example.product.repository;

import com.example.product.model.Category;
import com.example.product.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryJdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public CategoryJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Category> findAll() {
        String sql = "SELECT * FROM category";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Category(
                        rs.getInt("id"),
                        rs.getString("name")
                )
        );
    }
    public void save(Category category) {
        String sql = "INSERT INTO category(name) VALUES (?)";
        jdbcTemplate.update(sql, category.getName());
    }
}
