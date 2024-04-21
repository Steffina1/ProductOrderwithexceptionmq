package com.restapi.productsorders.controller;

import com.restapi.productsorders.Exception.OrderNotFoundException;
import com.restapi.productsorders.config.MessageConfig;
import com.restapi.productsorders.model.*;

import com.restapi.productsorders.service.*;
import jakarta.validation.Valid;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer_orders")
public class ProductOrderController {
ProdOrderService prodOrderService;
//ProductService productService;
RepresentativeService representativeService;
ProductWithOrderSer productWithOrderSer;
OrderDetailsWithRepIdService orderDetailsWithRepIdService;

@Autowired
private RabbitTemplate rabbitTemplate;
@Autowired
    OrderService orderService;

//    public ProductOrderController(ProdOrderService prodOrderService, OrderService orderService, RepresentativeService representativeService, ProductWithOrderSer productWithOrderSer, OrderDetailsWithRepIdService orderDetailsWithRepIdService) {
//        this.prodOrderService = prodOrderService;
//        this.orderService = orderService;
////        this.productService = productService;
//        this.representativeService = representativeService;
//        this.productWithOrderSer = productWithOrderSer;
//        this.orderDetailsWithRepIdService = orderDetailsWithRepIdService;
//    }

    @PostMapping("/producto/productorder")
    public ProductOrderDetails createProductOrderDetails(@RequestBody ProductOrderDetails productOrderDetails) {
      return  prodOrderService.createProductOrder(productOrderDetails);
  }
    @GetMapping
    public List<ProductOrderDetails> getAllProductOrders() {
        return prodOrderService.getAllProductOrderDetails();
    }

//  @PostMapping("/product/prod")
//    public ProductDetails createProductDetails(@RequestBody ProductDetails productDetails) {
//      return productService.createProductDetails(productDetails);
//
//  }
    @PostMapping("/product/prodorder")
    public ProductDetailsWithOrderId createProductDetailswithorderId(@RequestBody ProductDetailsWithOrderId productDetailsWithOrderId) {
        return  productWithOrderSer.createProductDetailsWithOrderId(productDetailsWithOrderId);

}

    @GetMapping("{orderId}")
    public ProductDetailsWithOrderId getProductDetailsByOrderId(@PathVariable("orderId") String orderId) {
        return productWithOrderSer.getProdDetailsByOrderId(orderId);
    }
//    @GetMapping("/product/prod/{productId}")
//    public ProductDetails  GetProductDetailsByProductId(@PathVariable("productId") int productId ) {
//        return productService.GetProductDetails(productId);
//
//    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/pro/order")
    public String createOrderDetails( @RequestBody @Valid OrderDetails orderDetails) {
        orderService.createOrderDetails(orderDetails);
        rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, orderDetails);
        return "Order placed successfully";
    }
    @GetMapping("/orders")
    public List<OrderDetails> getAllOrders() {
        return orderService.getAllOrderDetails();
    }
    @GetMapping("/orders/getByOrderId/{orderId}")
    public Optional<OrderDetails> GetOrderDetailsByOrderId(@PathVariable("orderId") String orderId ) throws OrderNotFoundException {
        return orderService.getOrderDetailsByOrderId(orderId);
    }
    @PutMapping("/pro/updateorder")
    public OrderDetails updateOrderDetails(@RequestBody OrderDetails orderDetails) {
        return orderService.updateOrderDetailsByOrderId(orderDetails);
    }
    @PostMapping("/rep/createrep")
    public RepresentativeDetails createRepresentativeDetails(@RequestBody RepresentativeDetails representativeDetails) {
       return representativeService.createRepDetails(representativeDetails);
    }
    @GetMapping("/representatives")
    public List<RepresentativeDetails> getAllRepresentatives() {
        return representativeService.getAllRepDetails();
    }
    @PostMapping("/orderrep/createorderwithrep")
    public OrderDetailsWithRepId createOrderDetailswithRepId(@RequestBody OrderDetailsWithRepId orderDetailsWithRepId) {
        return orderDetailsWithRepIdService.createOrderDetailswithRepId(orderDetailsWithRepId);
    }
    @GetMapping("/order/representId/{repId}")
    public OrderDetailsWithRepId getOrderDetailsByRepId(@PathVariable("repId") int representId) {
        return orderDetailsWithRepIdService.getOrderDetailsByRepId(representId);
    }


}
