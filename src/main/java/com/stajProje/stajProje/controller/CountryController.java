package com.stajProje.stajProje.controller;

import com.stajProje.stajProje.dto.CountryDto;
import com.stajProje.stajProje.dto.CountryMapper;
import com.stajProje.stajProje.entity.Country;
import com.stajProje.stajProje.service.abstracks.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {

    private final CountryService countryService;
    private final CountryMapper countryMapper;

    public CountryController(CountryService countryService, CountryMapper countryMapper) {
        this.countryService = countryService;
        this.countryMapper = countryMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDto> getCountry(@PathVariable UUID id){
        CountryDto result = countryMapper.CountryToCountryDto(countryService.findById(id));
        return ResponseEntity.ok(result);
    }

    @PostMapping("")
    public ResponseEntity<CountryDto> createCountry(@RequestBody CountryDto countryDto){

        Country result = countryService.save(countryMapper.CountryDtoToCountry(countryDto));
        return ResponseEntity.ok(countryMapper.CountryToCountryDto(result));
    }

    @GetMapping("")
    public List<Country> getAll(){
       return countryService.findAll();
    }

    @PutMapping("/{id}")
    public CountryDto updateCountry(@RequestBody CountryDto countryDto , @PathVariable UUID id){
        Country result = countryService.findById(id);
        result.setName(countryDto.getName());
        countryService.save(result);
        return countryMapper.CountryToCountryDto(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id){
        countryService.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
