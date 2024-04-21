//package com.restapi.productsorders.publisher;
//
//import com.restapi.productsorders.model.OrderDetails;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import static com.restapi.productsorders.config.MessageConfig.routing_key;
//
//@Service
//public class Publisher {
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//    @Autowired
//    private DirectExchange directExchange;
//
//    @Autowired
//    private Queue queue;
//    public String sendMsg(OrderDetails orderDetails) {
//        rabbitTemplate.convertAndSend("order_exchange1", "order_routingkey", orderDetails);
//        return "Message Sent to Queue";
//    }
//
//
//
//}
