package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service layer for customer business logic.
 *
 * @Service marks this class as a Spring service component.
 */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Retrieve all customers from the database.
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * Retrieve a single customer by ID.
     */
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    /**
     * Create a new customer record.
     */
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Update an existing customer, preserving only allowed fields.
     */
    public Customer update(Long id, Customer updatedCustomer) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setName(updatedCustomer.getName());
                    customer.setEmail(updatedCustomer.getEmail());
                    customer.setPhone(updatedCustomer.getPhone());
                    return customerRepository.save(customer);
                })
                .orElseThrow(() -> new RuntimeException("Customer not found with id " + id));
    }

    /**
     * Delete a customer by ID.
     */
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
