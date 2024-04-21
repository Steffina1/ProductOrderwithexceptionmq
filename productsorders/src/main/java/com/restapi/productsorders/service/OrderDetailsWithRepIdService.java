package com.restapi.productsorders.service;

import com.restapi.productsorders.model.OrderDetails;
import com.restapi.productsorders.model.OrderDetailsWithRepId;

import java.util.List;

public interface OrderDetailsWithRepIdService {
    public OrderDetailsWithRepId createOrderDetailswithRepId(OrderDetailsWithRepId orderDetailsWithRepId);
    public OrderDetailsWithRepId getOrderDetailsByRepId(int representId);
}
