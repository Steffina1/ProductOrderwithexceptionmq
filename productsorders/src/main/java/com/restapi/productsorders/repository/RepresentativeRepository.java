package com.restapi.productsorders.repository;

import com.restapi.productsorders.model.RepresentativeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepresentativeRepository extends JpaRepository<RepresentativeDetails, Integer> {
}
