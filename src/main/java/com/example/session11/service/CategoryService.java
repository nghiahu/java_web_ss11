package com.example.session11.service;

import com.example.session11.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
    boolean addCategory(CategoryDTO categoryDTO);
    boolean updateCategory(CategoryDTO categoryDTO);
    boolean deleteCategory(int id);
    CategoryDTO getCategoryById(int id);
}
