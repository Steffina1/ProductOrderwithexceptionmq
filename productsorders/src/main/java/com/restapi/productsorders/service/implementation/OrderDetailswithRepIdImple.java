package com.restapi.productsorders.service.implementation;

import com.restapi.productsorders.model.OrderDetailsWithRepId;
import com.restapi.productsorders.repository.OrderDetailsWithRepIdRepo;
import com.restapi.productsorders.service.OrderDetailsWithRepIdService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailswithRepIdImple implements OrderDetailsWithRepIdService {
   OrderDetailsWithRepIdRepo orderDetailsWithRepIdRepo;

    public OrderDetailswithRepIdImple(OrderDetailsWithRepIdRepo orderDetailsWithRepIdRepo) {
        this.orderDetailsWithRepIdRepo = orderDetailsWithRepIdRepo;
    }

    @Override
    public OrderDetailsWithRepId createOrderDetailswithRepId(OrderDetailsWithRepId orderDetailsWithRepId) {
         orderDetailsWithRepIdRepo.save(orderDetailsWithRepId);
        return orderDetailsWithRepId;
    }

    @Override
    public OrderDetailsWithRepId getOrderDetailsByRepId(int representId) {
        return orderDetailsWithRepIdRepo.findById(Integer.valueOf(String.valueOf(representId))).get();
    }
}
