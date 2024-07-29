package com.stajProje.stajProje.service.business;

import com.stajProje.stajProje.entity.Country;
import com.stajProje.stajProje.repository.CountryRepository;
import com.stajProje.stajProje.service.abstracks.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

        public Country save(Country country ){
        countryRepository.save(country);
            return country;
        }

    public Country findById(UUID id){
        return countryRepository.findById(id).orElseThrow(()-> new RuntimeException("the country not exist"));
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public void deleteById(UUID id){
        countryRepository.deleteById(id);
    }
}
