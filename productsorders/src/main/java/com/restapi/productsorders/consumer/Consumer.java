package com.restapi.productsorders.consumer;

import com.restapi.productsorders.config.MessageConfig;
import com.restapi.productsorders.model.OrderDetails;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



@Component
@RabbitListener(queues = "order_queue1")
public class Consumer {

    @RabbitHandler
    public void receiver(OrderDetails orderDetails) {
        System.out.println( "MenuOrder listener invoked - Consuming Message with Order Identifier : " + orderDetails.getOrderId());

    }
}
