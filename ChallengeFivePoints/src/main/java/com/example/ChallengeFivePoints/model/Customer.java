package com.example.ChallengeFivePoints.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.extern.java.Log;

import javax.persistence.*;


@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonProperty("id")
    private int customerId;
    @JsonProperty("FirstName")
    private String customerFirstName;
    @JsonProperty("LastName")
    private String customerLastName;
    @JsonProperty("Email")
    private String customerEmail;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
