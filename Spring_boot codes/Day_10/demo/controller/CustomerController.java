package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository repository;

    // Constructor Injection
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    // ✅ GET all customers
    @GetMapping
    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    // ✅ POST new customer
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }
}