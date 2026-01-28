package com.example.product.model;

public class Inventory {

    private int pId;
    private int quantity;

    public Inventory() {}

    public Inventory(int pId, int quantity) {
        this.pId = pId;
        this.quantity = quantity;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
