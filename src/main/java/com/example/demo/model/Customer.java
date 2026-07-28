package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Customer entity represents a customer record persisted by JPA.
 *
 * @Entity marks this class as a JPA entity managed by Spring Data JPA.
 */
@Entity
public class Customer {

    /**
     * Primary key for the customer record.
     * @Id marks this field as the entity identifier.
     * @GeneratedValue configures automatic ID generation.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Customer name field
    private String name;

    // Customer email address
    private String email;

    // Customer phone number
    private String phone;

    public Customer() {
    }

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
