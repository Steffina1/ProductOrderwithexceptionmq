package com.restapi.productsorders.repository;

import com.restapi.productsorders.model.ProductDetailsWithOrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsWithOrderIdRepo extends JpaRepository<ProductDetailsWithOrderId, String> {
}
