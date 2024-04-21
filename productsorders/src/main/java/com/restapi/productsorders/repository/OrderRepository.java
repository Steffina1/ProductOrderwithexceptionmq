package com.restapi.productsorders.repository;

import com.restapi.productsorders.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface OrderRepository extends JpaRepository<OrderDetails, String> {

}
