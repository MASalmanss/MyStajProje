package com.stajProje.stajProje.service;

import com.stajProje.stajProje.dto.CountryDto;
import com.stajProje.stajProje.entity.Country;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CategoryService {

    public Country save(Country country);

    public CountryDto findById(UUID uuid);

    public List<CountryDto> findAll();

    public void deleteById(UUID id);
}
