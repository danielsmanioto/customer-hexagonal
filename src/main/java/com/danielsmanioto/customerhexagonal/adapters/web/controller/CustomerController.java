package com.danielsmanioto.customerhexagonal.adapters.web.controller;

import com.danielsmanioto.customerhexagonal.domain.model.Customer;
import com.danielsmanioto.customerhexagonal.ports.CustomerUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerUseCase customerUseCase;

    public CustomerController(CustomerUseCase customerUseCase) {
        this.customerUseCase = customerUseCase;
    }

    @GetMapping
    public List<Customer> findAllCustomers() {
        return customerUseCase.findAll();
    }

}
