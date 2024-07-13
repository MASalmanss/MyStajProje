package com.stajProje.stajProje.controller;

import com.stajProje.stajProje.dto.CategoryDto;
import com.stajProje.stajProje.dto.CategoryMapper;
import com.stajProje.stajProje.dto.CountryDto;
import com.stajProje.stajProje.entity.Category;
import com.stajProje.stajProje.entity.Country;
import com.stajProje.stajProje.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    public CategoryController(CategoryService categoryService, CategoryMapper categoryMapper) {
        this.categoryService = categoryService;
        this.categoryMapper = categoryMapper;
    }


    @PostMapping("")
    public ResponseEntity<CategoryDto> createCountry(@RequestBody CategoryDto categoryDto){

        Category result = categoryService.save(categoryMapper.categoryDtoToCategory(categoryDto));
        return ResponseEntity.ok(categoryMapper.categoryToCategoryDto(result));
    }

    @GetMapping("")
    public List<Category> getAll(){
        return categoryService.findAll();
    }
}
