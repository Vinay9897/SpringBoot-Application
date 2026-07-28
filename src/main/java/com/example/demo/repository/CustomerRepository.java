package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for Customer persistence.
 *
 * Extends JpaRepository to inherit built-in CRUD operations such as
 * save, findById, findAll, and deleteById.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
