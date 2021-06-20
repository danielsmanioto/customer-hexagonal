package com.danielsmanioto.customerhexagonal.ports;

import com.danielsmanioto.customerhexagonal.domain.model.Customer;

import java.util.List;

public interface CustomerUseCase {

    List<Customer> findAll();

}
