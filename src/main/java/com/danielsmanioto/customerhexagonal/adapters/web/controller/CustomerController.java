package com.danielsmanioto.customerhexagonal.adapters.web.controller;

import com.danielsmanioto.customerhexagonal.adapters.web.dto.out.CustomerDTOOut;
import com.danielsmanioto.customerhexagonal.adapters.web.mapper.CustomerMapper;
import com.danielsmanioto.customerhexagonal.domain.model.Customer;
import com.danielsmanioto.customerhexagonal.ports.CustomerUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerUseCase customerUseCase;
    private final CustomerMapper customerMapper;

    public CustomerController(CustomerUseCase customerUseCase, CustomerMapper customerMapper) {
        this.customerUseCase = customerUseCase;
        this.customerMapper = customerMapper;
    }

    @GetMapping
    public List<CustomerDTOOut> findAllCustomers() {
        List<Customer> customers = customerUseCase.findAll();
        return customers.stream()
                .map(customerMapper::toDTO)
                .collect(Collectors.toList());
    }

}
