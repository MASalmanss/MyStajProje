package com.stajProje.stajProje.repository;

import com.stajProje.stajProje.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CountryRepository extends JpaRepository<Country,UUID> {
}
