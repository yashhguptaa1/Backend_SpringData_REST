package com.yg.SpringDataRest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue
    public Long id;
    public String firstName;
    public String lastName;
    public String email;

    public Contact() {}

    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

