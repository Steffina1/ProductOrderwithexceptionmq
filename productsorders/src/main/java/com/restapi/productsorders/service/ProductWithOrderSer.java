package com.restapi.productsorders.service;

import com.restapi.productsorders.model.OrderDetails;
import com.restapi.productsorders.model.ProductDetailsWithOrderId;
import org.springframework.stereotype.Service;


public interface ProductWithOrderSer {
    public ProductDetailsWithOrderId createProductDetailsWithOrderId(ProductDetailsWithOrderId productDetailsWithOrderId);
    public ProductDetailsWithOrderId getProdDetailsByOrderId(String orderId);
}
