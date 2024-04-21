//package com.restapi.productsorders.model;
//
//import jakarta.persistence.*;
//
//import java.util.ArrayList;
//@Entity
//@Table(name="product_details")
//public class ProductDetails {
//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    public String name;
//    public String productDescription;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public int productId;
//
//    public ProductDetails() {
//    }
//
//    public ProductDetails(String name, String productDescription, int productId) {
//        this.name = name;
//        this.productDescription = productDescription;
//        this.productId = productId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public String getProductDescription() {
//        return productDescription;
//    }
//
//    public void setProductDescription(String productDescription) {
//        this.productDescription = productDescription;
//    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//}
