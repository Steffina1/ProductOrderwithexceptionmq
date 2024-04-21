package com.restapi.productsorders.repository;

import com.restapi.productsorders.model.OrderDetailsWithRepId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsWithRepIdRepo extends JpaRepository<OrderDetailsWithRepId, Integer> {
}
