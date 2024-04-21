package com.restapi.productsorders.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="order_details")
public class OrderDetails {
    @Id
    private String orderId;
    @NotBlank(message = "order address should not be blank")
    private String orderAddress;
    //private int representativeId;
    @Column(length = 3000)
    @NotNull(message="product name should not be null")
    private String productName;
   // private int productId;
    public OrderDetails() {
    }

    public OrderDetails(String orderId, String orderAddress, String productName) {
        this.orderId = orderId;
        this.orderAddress = orderAddress;
        this.productName = productName;
    }
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
