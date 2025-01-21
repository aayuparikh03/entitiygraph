package com.example.repository;

import com.example.entity.Customer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Override
    @EntityGraph(attributePaths = {"orders"})
    List<Customer>findAll();
}
