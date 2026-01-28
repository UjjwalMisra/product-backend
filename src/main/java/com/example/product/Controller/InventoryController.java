package com.example.product.controller;

import com.example.product.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addStock(
            @RequestParam int productId,
            @RequestParam int quantity) {

        inventoryService.addStock(productId, quantity);
        return ResponseEntity.ok("Stock added");
    }

    @PostMapping("/remove")
    public ResponseEntity<String> removeStock(
            @RequestParam int productId,
            @RequestParam int quantity) {

        inventoryService.removeStock(productId, quantity);
        return ResponseEntity.ok("Stock removed");
    }
}
