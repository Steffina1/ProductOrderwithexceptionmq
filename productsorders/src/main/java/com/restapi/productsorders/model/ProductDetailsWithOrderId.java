package com.restapi.productsorders.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="product_details_orderId")
public class ProductDetailsWithOrderId {
    @Column(length = 3000)
    private ArrayList<Object> productName;
    private int productId;
    public String productDescription;
    @Id
    public String orderId;

    public ProductDetailsWithOrderId() {
    }

    public ProductDetailsWithOrderId(ArrayList<Object> productName, int productId, String productDescription, String orderId) {
        this.productName = productName;
        this.productId = productId;
        this.productDescription = productDescription;
        this.orderId = orderId;
    }

    public ArrayList<Object> getProductName() {
        return productName;
    }

    public void setProductName(ArrayList<Object> productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
