//package com.restapi.productsorders.service.implementation;
//
//import com.restapi.productsorders.model.ProductDetails;
//import com.restapi.productsorders.repository.ProdRepository;
//import com.restapi.productsorders.service.ProductService;
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class ProductImplementation implements ProductService {
//
//    ProdRepository prodRepository;
//
//    public ProductImplementation(ProdRepository prodRepository) {
//        this.prodRepository = prodRepository;
//    }
//
//    @Override
//    public ProductDetails createProductDetails(ProductDetails productDetails) {
//        prodRepository.save(productDetails);
//        return productDetails;
//    }
//    @Override
//    public ProductDetails GetProductDetails(int productId){
//        return prodRepository.findById(String.valueOf(productId)).get();
//    }
//}
