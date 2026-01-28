package com.example.product.model;

import java.time.LocalDateTime;

public class InventoryHistory {

    private int historyId;
    private int pId;
    private int changeQty;
    private String type; // IN / OUT
    private LocalDateTime createdAt;

    public InventoryHistory() {}

    public InventoryHistory(int historyId, int pId, int changeQty, String type, LocalDateTime createdAt) {
        this.historyId = historyId;
        this.pId = pId;
        this.changeQty = changeQty;
        this.type = type;
        this.createdAt = createdAt;
    }

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public int getChangeQty() {
        return changeQty;
    }

    public void setChangeQty(int changeQty) {
        this.changeQty = changeQty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
