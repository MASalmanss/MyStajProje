package com.stajProje.stajProje.dto;

import com.stajProje.stajProje.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryDto CountryToCountryDto(Country country);

    @Mapping(target = "id" , ignore = true)
    Country CountryDtoToCountry(CountryDto countryDto);
}
