package com.yg.SpringDataRest.tcs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "ssn_id")
    private String ssnId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    public Customer()
    {

    }

    public Customer(Long customerId, String ssnId, String customerName, Integer age, String address, String state, String city) {
        this.customerId = customerId;
        this.ssnId = ssnId;
        this.customerName = customerName;
        this.age = age;
        this.address = address;
        this.state = state;
        this.city = city;


    }
}
