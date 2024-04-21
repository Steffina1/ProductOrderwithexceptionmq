package com.restapi.productsorders.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="rep_details")
public class RepresentativeDetails {
    @Column(length = 3000)
    @Id
    private int representativeId;
    private List<String> orderId;
    private String representativeName;

    public RepresentativeDetails() {
    }

    public RepresentativeDetails(int representativeId, List<String> orderId, String representativeName) {
        this.representativeId = representativeId;
        this.orderId = orderId;
        this.representativeName = representativeName;
    }

    public int getRepresentativeId() {
        return representativeId;
    }

    public void setRepresentativeId(int representativeId) {
        this.representativeId = representativeId;
    }

    public List<String> getOrderId() {
        return orderId;
    }

    public void setOrderId(List<String> orderId) {
        this.orderId = orderId;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }
}






