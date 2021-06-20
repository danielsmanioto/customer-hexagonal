package com.danielsmanioto.customerhexagonal.adapters.web.mapper;

import com.danielsmanioto.customerhexagonal.adapters.web.dto.out.CustomerDTOOut;
import com.danielsmanioto.customerhexagonal.domain.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "email", source = "email")
    })
    CustomerDTOOut toDTO(Customer dto);

}
