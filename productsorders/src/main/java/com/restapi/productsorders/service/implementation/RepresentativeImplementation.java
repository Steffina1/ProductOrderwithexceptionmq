package com.restapi.productsorders.service.implementation;

import com.restapi.productsorders.model.OrderDetails;
import com.restapi.productsorders.model.RepresentativeDetails;
import com.restapi.productsorders.repository.RepresentativeRepository;
import com.restapi.productsorders.service.RepresentativeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepresentativeImplementation implements RepresentativeService {
    RepresentativeRepository representativeRepository;

    public RepresentativeImplementation(RepresentativeRepository representativeRepository) {
        this.representativeRepository = representativeRepository;
    }
    @Override
    public RepresentativeDetails createRepDetails(RepresentativeDetails representativeDetails) {
        representativeRepository.save(representativeDetails);
        return representativeDetails;
    }

    @Override
    public RepresentativeDetails getOrderIdByRepId(int representativeId) {
        return representativeRepository.findById(representativeId).get();
    }
    @Override
    public List<RepresentativeDetails> getAllRepDetails() {
        return representativeRepository.findAll();
    }


}
