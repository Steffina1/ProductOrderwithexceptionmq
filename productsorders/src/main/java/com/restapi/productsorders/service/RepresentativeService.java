package com.restapi.productsorders.service;

import com.restapi.productsorders.model.OrderDetails;
import com.restapi.productsorders.model.RepresentativeDetails;

import java.util.List;

public interface RepresentativeService {

    public List<RepresentativeDetails> getAllRepDetails();
    public RepresentativeDetails createRepDetails(RepresentativeDetails representativeDetails);
    public RepresentativeDetails getOrderIdByRepId(int representativeId);

}
