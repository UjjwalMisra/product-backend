package com.example.product.model;

import java.time.LocalDateTime;

public class Orders {

    private int orderId;
    private int clientId;
    private int pId;
    private int quantity;
    private String orderStatus;
    private String paymentStatus;
    private LocalDateTime createdAt;

    public Orders() {}

    public Orders(int orderId, int clientId, int pId, int quantity,
                  String orderStatus, String paymentStatus, LocalDateTime createdAt) {
        this.orderId = orderId;
        this.clientId = clientId;
        this.pId = pId;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
        this.paymentStatus = paymentStatus;
        this.createdAt = createdAt;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
