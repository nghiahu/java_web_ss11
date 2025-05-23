package com.example.session11.repository;

import com.example.session11.dto.CategoryDTO;

import java.util.List;

public interface CategoryRepository {
    List<CategoryDTO> getAllCatalog();
    CategoryDTO searchByCategoryName(String categoryName);
    boolean addNewCategory(CategoryDTO categoryDTO);
    boolean updateCategory(CategoryDTO categoryDTO);
    boolean deleteCategory(int id);
    CategoryDTO getCategoryById(int id);
}
