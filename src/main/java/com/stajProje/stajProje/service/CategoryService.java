package com.stajProje.stajProje.service;

import com.stajProje.stajProje.entity.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    public Category save(Category category);

    public Category findById(UUID uuid);

    public List<Category> findAll();

    public void deleteById(UUID id);
}
