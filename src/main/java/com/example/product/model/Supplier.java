package com.example.product.model;

public class Supplier {

    private int sId;
    private String sName;

    public Supplier() {}

    public Supplier(int sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public int getSId() {
        return sId;
    }

    public void setSId(int sId) {
        this.sId = sId;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }
}
