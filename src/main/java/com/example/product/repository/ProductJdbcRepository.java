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
                        rs.getDouble("price"),
                        rs.getInt("category_id"),
                        rs.getString("category_name")
                )
        );
    }
    public List<Product> findByCategoryName(String categoryName) {

        String sql = "SELECT * FROM product WHERE category_name = ?";

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("category_id"),
                        rs.getString("category_name")
                ),
                categoryName
        );
    }

    public Product findById(int id) {
        String sql = "SELECT * FROM product WHERE id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                (rs, rowNum) -> new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("category_id"),
                        rs.getString("category_name")
                ),
                id
        );
    }


    public void save(Product product) {
        String sql = """
        INSERT INTO product (name, price, category_id, category_name)
        VALUES (?, ?, ?, ?)
    """;

        jdbcTemplate.update(
                sql,
                product.getName(),
                product.getPrice(),
                product.getCategoryId(),
                product.getCategoryName()
        );
    }


}
