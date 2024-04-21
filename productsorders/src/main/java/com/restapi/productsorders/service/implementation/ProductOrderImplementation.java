package com.restapi.productsorders.service.implementation;

import com.restapi.productsorders.model.ProductOrderDetails;
import com.restapi.productsorders.repository.ProductsOrderRepository;
import com.restapi.productsorders.service.ProdOrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductOrderImplementation implements ProdOrderService {

    ProductsOrderRepository productsOrderRepository;

    public ProductOrderImplementation(ProductsOrderRepository productsOrderRepository) {
        this.productsOrderRepository = productsOrderRepository;
    }

    @Override
    public List<ProductOrderDetails> getAllProductOrderDetails() {
        return productsOrderRepository.findAll();
    }

    @Override
    public ProductOrderDetails createProductOrder(ProductOrderDetails productOrderDetails) {
        productsOrderRepository.save(productOrderDetails);
        return productOrderDetails;
    }
}
