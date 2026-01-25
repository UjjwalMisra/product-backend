package com.example.product.model;

public class Product {

    // ------------------------
    // DATABASE COLUMNS
    // ------------------------

    // Primary key of product table
    private int id;

    // Product name
    private String name;

    // Product price
    private double price;

    // Foreign key -> category.id
    private int categoryId;

    // ------------------------
    // JOINED COLUMN (NOT STORED)
    // ------------------------

    // Comes from JOIN with category table
    // This is NOT stored in product table anymore
    private String categoryName;

    // ------------------------
    // CONSTRUCTORS
    // ------------------------

    /*
     * Default constructor
     * Required by:
     * - Spring
     * - Jackson (JSON -> Object)
     * - JdbcTemplate internally
     */
    public Product() {
    }

    /*
     * Used when:
     * - Inserting product
     * - We only know categoryId
     * - NO JOIN involved
     */
    public Product(int id, String name, double price, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    /*
     * Used when:
     * - Fetching product using JOIN
     * - We want category name also
     */
    public Product(int id, String name, double price, int categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    // ------------------------
    // GETTERS
    // ------------------------

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    // ------------------------
    // SETTERS
    // ------------------------

    /*
     * Setters are needed because:
     * - Jackson sets values field-by-field
     * - JDBC mapping sometimes uses them
     */

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
