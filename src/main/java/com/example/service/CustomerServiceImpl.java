package com.example.service;

import com.example.entity.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(int id, Customer customer) {
        Customer existingCustomer = findById(id);
        if (existingCustomer != null) {
            if (customer.getName() != null) existingCustomer.setName(customer.getName());
            if (customer.getCity() != null) existingCustomer.setCity(customer.getCity());
            return customerRepository.save(existingCustomer);
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }
}
