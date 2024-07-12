package com.stajProje.stajProje.service;

import com.stajProje.stajProje.entity.Country;

import java.util.List;
import java.util.UUID;

public interface CountryService {

    public Country save(Country country);

    public Country findById(UUID uuid);

    public List<Country> findAll();

    public void deleteById(UUID id);
}
