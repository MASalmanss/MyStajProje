package com.stajProje.stajProje.dto;

import com.stajProje.stajProje.entity.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryDto CountryToCountryDto(Country country);

    Country CountryDtoToCountry(CountryDto countryDto);
}
