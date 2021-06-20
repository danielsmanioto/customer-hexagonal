package com.danielsmanioto.customerhexagonal.domain.usecases;

import com.danielsmanioto.customerhexagonal.domain.model.Customer;
import com.danielsmanioto.customerhexagonal.domain.repository.CustomerRepository;
import com.danielsmanioto.customerhexagonal.ports.CustomerUseCase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerUseCaseImpl implements CustomerUseCase {

    private final CustomerRepository repository;

    public CustomerUseCaseImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

}
