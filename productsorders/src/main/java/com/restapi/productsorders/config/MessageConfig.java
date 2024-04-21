package com.restapi.productsorders.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.*;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.ConditionalRejectingErrorHandler;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ErrorHandler;


@Configuration
public class MessageConfig {

public static String QUEUE= "order_queue1";
    public static String EXCHANGE= "order_exchange1";
    public static  String ROUTING_KEY= "order_routingkey1";
    public static  String virtualhost= "/";
    public static  String host= "localhost";
    public static  String username= "guest";
    public static  String password= "guest";
    public static  Integer replyTimeout= 60000;
    public static  Integer concurrentConsumers= 1;
    public static  Integer maxConcurrentConsumers= 1;






    @Bean
    public Queue queue() {
      return new Queue(QUEUE);
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, DirectExchange directExchange) {
return BindingBuilder.bind(queue).to(directExchange).with(ROUTING_KEY);
    }

    @Bean
    public MessageConverter converter() {
        //ObjectMapper objectMapper = new ObjectMapper();
        return new Jackson2JsonMessageConverter();
    }

//    @Bean
//    public ConnectionFactory connectionFactory() {
//        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
//        connectionFactory.setVirtualHost(virtualhost);
//        connectionFactory.setHost(host);
//        connectionFactory.setUsername(username);
//        connectionFactory.setPassword(password);
//        return connectionFactory;
//    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        //rabbitTemplate.setDefaultReceiveQueue(queue_name);
        rabbitTemplate.setMessageConverter(converter());
//        rabbitTemplate.setReplyAddress(queue().getName());
//        rabbitTemplate.setReplyTimeout(replyTimeout);
//        rabbitTemplate.setUseDirectReplyToContainer(false);
        return rabbitTemplate;
    }

//    @Bean
//    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory() {
//        final SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory());
//        factory.setMessageConverter(converter());
//        factory.setConcurrentConsumers(concurrentConsumers);
//        factory.setMaxConcurrentConsumers(maxConcurrentConsumers);
//        //factory.setErrorHandler(errorHandler());
//        return factory;
//    }
//    @Bean
//    public ErrorHandler errorHandler() {
//        return new ConditionalRejectingErrorHandler(new MyFatalExceptionStrategy());
//    }
//    public static class MyFatalExceptionStrategy extends ConditionalRejectingErrorHandler.DefaultExceptionStrategy {
//        @Override
//        public boolean isFatal(Throwable t) {
//            if (t instanceof ListenerExecutionFailedException) {
//                ListenerExecutionFailedException lefe = (ListenerExecutionFailedException) t;
//                logger.error("Failed to process inbound message from queue "
//                        + lefe.getFailedMessage().getMessageProperties().getConsumerQueue()
//                        + "; failed message: " + lefe.getFailedMessage(), t);
//            }
//            return super.isFatal(t);
//        }
//    }

}
