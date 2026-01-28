package com.example.product.model;

public class Product {

    private int pId;
    private String name;
    private double price;
    private Integer categoryId; // nullable

    public Product() {}

    public Product(int pId, String name, double price, Integer categoryId) {
        this.pId = pId;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
