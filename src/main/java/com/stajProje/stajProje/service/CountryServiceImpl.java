package com.stajProje.stajProje.service;

import com.stajProje.stajProje.dto.CountryDto;
import com.stajProje.stajProje.entity.Country;
import com.stajProje.stajProje.repository.CountryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class CountryServiceImpl implements CategoryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country save(Country country){
        return  countryRepository.save(country);
    }

    public CountryDto findById(UUID uuid){
        Optional<Country> result = countryRepository.findById(uuid);

        if(result.isPresent()) {
            CountryDto countryDto = new CountryDto(result.get().getId(), result.get().getName());
            return countryDto;
        }
        else {
            throw new RuntimeException("the id couşdnt find");

        }
    }

    public List<CountryDto> findAll(){
        List<Country> list = countryRepository.findAll();
        List<CountryDto> listDto = new ArrayList<>();

        for (Country i : list){
            CountryDto tempCountrydto = new CountryDto(i.getId() , i.getName());
            listDto.add(tempCountrydto);
        }
        return listDto;
    }

    public void deleteById(UUID id){
        countryRepository.deleteById(id);
    }
}
