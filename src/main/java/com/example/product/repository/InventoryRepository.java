package com.example.product.repository;

import com.example.product.model.Inventory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepository {

    private final JdbcTemplate jdbcTemplate;

    public InventoryRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Inventory findByProductId(int productId) {
        String sql = "SELECT * FROM inventory WHERE product_id = ?";
        return jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Inventory.class),
                productId
        );
    }

    public void createInventory(int productId) {
        String sql = "INSERT INTO inventory (product_id, quantity) VALUES (?, 0)";
        jdbcTemplate.update(sql, productId);
    }

    public void updateQuantity(int productId, int quantity) {
        String sql = "UPDATE inventory SET quantity = ? WHERE product_id = ?";
        jdbcTemplate.update(sql, quantity, productId);
    }
}
