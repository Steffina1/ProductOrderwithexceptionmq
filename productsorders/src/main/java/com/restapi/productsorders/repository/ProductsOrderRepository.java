package com.restapi.productsorders.repository;

import com.restapi.productsorders.model.ProductOrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsOrderRepository extends JpaRepository<ProductOrderDetails, Integer> {
}
