package com.danielsmanioto.customerhexagonal.domain.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

    @Test
    @DisplayName("Validate getter and setter / constructor name and email")
    void validaGetAndSetter() {
        var customer = new Customer("daniel", "daniel.smanioto@gmail.com");
        assertThat(customer).isNotNull();
        assertThat(customer.getName()).isEqualTo("daniel");
        assertThat(customer.getEmail()).isEqualTo("daniel.smanioto@gmail.com");
    }

}
