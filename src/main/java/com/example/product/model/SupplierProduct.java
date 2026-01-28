package com.example.product.model;

public class SupplierProduct {

    private int sId;
    private int pId;

    public SupplierProduct() {}

    public SupplierProduct(int sId, int pId) {
        this.sId = sId;
        this.pId = pId;
    }

    public int getSId() {
        return sId;
    }

    public void setSId(int sId) {
        this.sId = sId;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }
}
