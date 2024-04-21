package com.restapi.productsorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProductsordersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsordersApplication.class, args);
	}

}
