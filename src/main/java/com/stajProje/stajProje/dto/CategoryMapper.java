package com.stajProje.stajProje.dto;

import com.stajProje.stajProje.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CategoryMapper {
    CategoryDto categoryToCategoryDto(Category category);
    @Mapping(target = "id" , ignore = true)
    Category categoryDtoToCategory(CategoryDto categoryDto);
}
