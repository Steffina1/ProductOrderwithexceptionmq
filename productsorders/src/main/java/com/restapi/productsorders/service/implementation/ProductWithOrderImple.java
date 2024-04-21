package com.restapi.productsorders.service.implementation;

import com.restapi.productsorders.model.ProductDetailsWithOrderId;
import com.restapi.productsorders.repository.ProductDetailsWithOrderIdRepo;
import com.restapi.productsorders.repository.ProductsOrderRepository;
import com.restapi.productsorders.service.ProductWithOrderSer;
import org.springframework.stereotype.Service;

@Service
public class ProductWithOrderImple implements ProductWithOrderSer {
   ProductDetailsWithOrderIdRepo productDetailsWithOrderIdRepo;

    public ProductWithOrderImple(ProductDetailsWithOrderIdRepo productDetailsWithOrderIdRepo) {
        this.productDetailsWithOrderIdRepo = productDetailsWithOrderIdRepo;
    }

    @Override
    public ProductDetailsWithOrderId createProductDetailsWithOrderId(ProductDetailsWithOrderId productDetailsWithOrderId) {
        productDetailsWithOrderIdRepo.save(productDetailsWithOrderId);
        return productDetailsWithOrderId;
    }

    @Override
    public ProductDetailsWithOrderId getProdDetailsByOrderId(String orderId) {
        return productDetailsWithOrderIdRepo.findById(orderId).get();
    }

}
