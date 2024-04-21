package com.restapi.productsorders.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;

@Entity
@Table(name="order_details_repid")
public class OrderDetailsWithRepId {

    private String orderId;
    private String orderAddress;
    @Id
    public int representId;
    private String CustomerName;
    @Column(length = 3000)
    private ArrayList<Object> productName;
    private int productId;


    public OrderDetailsWithRepId() {
    }

    public OrderDetailsWithRepId(String orderId, String orderAddress, int representId, ArrayList<Object> productName, int productId, String customerName) {
        this.orderId = orderId;
        this.orderAddress = orderAddress;
        this.representId = representId;
        this.productName = productName;
        this.productId = productId;
        CustomerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public int getRepresentativeId() {
        return representId;
    }

    public void setRepresentativeId(int representId) {
        this.representId = representId;
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

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}

