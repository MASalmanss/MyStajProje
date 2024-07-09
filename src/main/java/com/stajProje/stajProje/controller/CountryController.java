package com.stajProje.stajProje.controller;

import com.stajProje.stajProje.dto.CountryDto;
import com.stajProje.stajProje.entity.Country;
import com.stajProje.stajProje.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CountryController {

    private final CategoryService categoryService;

    public CountryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/country")
    public List<CountryDto> getList(){
        return categoryService.findAll();
    }

    @GetMapping("/country/{id}")
    public CountryDto getCountry(@PathVariable UUID uuid){
        return categoryService.findById(uuid);
    }


}
