package com.restapi.productsorders.service;

import com.restapi.productsorders.Exception.OrderNotFoundException;
import com.restapi.productsorders.model.OrderDetails;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public String createOrderDetails(OrderDetails orderDetails);
    public List<OrderDetails> getAllOrderDetails();
    public Optional<OrderDetails> getOrderDetailsByOrderId(String orderId) throws OrderNotFoundException;

    public OrderDetails updateOrderDetailsByOrderId(OrderDetails orderDetails);

}
