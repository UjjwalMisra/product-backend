package com.example.product.service;

import com.example.product.model.Inventory;
import com.example.product.repository.InventoryRepository;
import com.example.product.repository.InventoryTransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;
    private final InventoryTransactionRepository transactionRepository;

    public InventoryService(
            InventoryRepository inventoryRepository,
            InventoryTransactionRepository transactionRepository) {
        this.inventoryRepository = inventoryRepository;
        this.transactionRepository = transactionRepository;
    }

    @Transactional
    public void addStock(int productId, int quantity) {
        Inventory inventory = inventoryRepository.findByProductId(productId);
        int newQty = inventory.getQuantity() + quantity;

        inventoryRepository.updateQuantity(productId, newQty);
        transactionRepository.save(productId, quantity, "IN");
    }

    @Transactional
    public void removeStock(int productId, int quantity) {
        Inventory inventory = inventoryRepository.findByProductId(productId);

        if (inventory.getQuantity() < quantity) {
            throw new RuntimeException("Insufficient stock");
        }

        int newQty = inventory.getQuantity() - quantity;

        inventoryRepository.updateQuantity(productId, newQty);
        transactionRepository.save(productId, -quantity, "OUT");
    }
}
