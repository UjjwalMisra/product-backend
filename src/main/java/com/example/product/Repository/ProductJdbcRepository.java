package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductJdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll() {
        String sql = "SELECT * FROM product";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
            new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("price")
            )
        );
    }

    public void save(Product product) {
        String sql = "INSERT INTO product(name, price) VALUES (?, ?)";
        jdbcTemplate.update(sql, product.getName(), product.getPrice());
    }
}
