package com.danielsmanioto.customerhexagonal.domain.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerRepositoryTest {

    @Test
    @DisplayName("Validate Find All")
    void validateFindAll() {
        var customers = new CustomerRepository().findAll();
        assertThat(customers)
                .isNotNull()
                .isNotEmpty()
                .hasSize(2);
    }


}
