package com.restapi.productsorders.service.implementation;

import com.restapi.productsorders.Exception.OrderNotFoundException;
import com.restapi.productsorders.model.OrderDetails;
//import com.restapi.productsorders.model.ProductDetails;
import com.restapi.productsorders.repository.OrderRepository;
import com.restapi.productsorders.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderImplementation implements OrderService {
    OrderRepository orderRepository;

    public OrderImplementation(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public String createOrderDetails(OrderDetails orderDetails) {
        orderRepository.save(orderDetails);
        return "Order placed";
    }

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        return orderRepository.findAll();
    }

    @Override
//    @Cacheable(cacheNames="getOrderDetailsByOrderId", key="#orderId")
    public Optional<OrderDetails> getOrderDetailsByOrderId(String orderId) throws OrderNotFoundException {
          Optional<OrderDetails> orderDetails=orderRepository.findById(orderId);
          if(orderDetails.isPresent()) {
              return orderDetails;
          } else {
              throw new OrderNotFoundException("order not found with id" +orderId);
          }
    }

    @Override
    public OrderDetails updateOrderDetailsByOrderId(OrderDetails orderDetails) {
         orderRepository.save(orderDetails);
        return orderDetails;
    }

}
