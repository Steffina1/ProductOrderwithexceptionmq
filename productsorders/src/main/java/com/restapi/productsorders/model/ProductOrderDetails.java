package com.restapi.productsorders.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="product_order_details")
public class ProductOrderDetails {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 3000)
    private ArrayList<Object> productName;
    private String customerName;
    private String customerAddress;
    public String productDescription;
    @Id
    public int productId;
    private String orderId;

    public ProductOrderDetails() {
    }

    public ProductOrderDetails(ArrayList<Object> productName, String customerName, String customerAddress, String productDescription, int productId, String orderId) {
        this.productName = productName;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.productDescription = productDescription;
        this.productId = productId;
        this.orderId = orderId;
    }


    public ArrayList<Object> getProductName() {
        return productName;
    }

    public void setProductName(ArrayList<Object> productName) {
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
