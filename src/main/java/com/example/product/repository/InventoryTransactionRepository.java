package com.example.product.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryTransactionRepository {

    private final JdbcTemplate jdbcTemplate;

    public InventoryTransactionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(int productId, int changeQty, String type) {
        String sql = """
            INSERT INTO inventory_transactions (product_id, change_qty, type)
            VALUES (?, ?, ?)
        """;

        jdbcTemplate.update(sql, productId, changeQty, type);
    }
}
