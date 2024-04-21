package com.restapi.productsorders.service;

import com.restapi.productsorders.model.ProductOrderDetails;

import java.util.List;

public interface ProdOrderService {
    public List<ProductOrderDetails> getAllProductOrderDetails();
    public ProductOrderDetails createProductOrder(ProductOrderDetails productOrderDetails);
}
