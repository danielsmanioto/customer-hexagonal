package com.danielsmanioto.customerhexagonal.domain.usecases;

import com.danielsmanioto.customerhexagonal.domain.model.Customer;
import com.danielsmanioto.customerhexagonal.domain.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CustomerUseCaseImplTest {

    @InjectMocks
    private CustomerUseCaseImpl customerUseCase;

    @Mock
    private CustomerRepository repository;

    @BeforeEach
    void setup() {
        given(repository.findAll())
                .willReturn(Arrays.asList(new Customer("daniel", "daniel.smanioto@gmail.com"),
                        new Customer("carol", "carolsmanioto@gmail.com")));
    }

    @Test
    @DisplayName("Validate Find All")
    void validateFindAll() {
        var customers = customerUseCase.findAll();
        assertThat(customers)
                .isNotNull()
                .isNotEmpty()
                .hasSize(2);
    }

}
