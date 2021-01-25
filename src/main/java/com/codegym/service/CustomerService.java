package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void update(Long id, Customer customer);

    void delete(Long id);

    void save(Customer customer);
}
