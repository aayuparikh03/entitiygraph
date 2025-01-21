package com.example.service;

import com.example.entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    Customer save(Customer customer);
    Customer update(int id, Customer customer);
    void deleteById(int id);
}
