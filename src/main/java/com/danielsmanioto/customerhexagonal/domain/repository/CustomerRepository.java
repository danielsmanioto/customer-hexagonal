package com.danielsmanioto.customerhexagonal.domain.repository;

import com.danielsmanioto.customerhexagonal.domain.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerRepository {

    public List<Customer> findAll() {
        return Arrays.asList(new Customer("daniel", "daniel.smanioto@gmail.com"),
                new Customer("carol", "carolsmanioto@gmail.com"));
    }

}
