package com.example.product.model;

public class Product {

    private int id;
    private String name;
    private double price;
    private int categoryId;
    private String categoryName;

    public Product() {}

    public Product(int id, String name, double price, int categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getCategoryId() { return categoryId; }
    public String getCategoryName() { return categoryName; }
}
