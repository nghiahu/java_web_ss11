package com.example.session11.service;

import com.example.session11.dto.CategoryDTO;
import com.example.session11.repository.CategoryRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepositoryImp categoryRepositoryImp;

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepositoryImp.getAllCatalog();
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return categoryRepositoryImp.searchByCategoryName(name);
    }

    @Override
    public boolean addCategory(CategoryDTO categoryDTO) {
        return categoryRepositoryImp.addNewCategory(categoryDTO);
    }

    @Override
    public boolean updateCategory(CategoryDTO categoryDTO) {
        return categoryRepositoryImp.updateCategory(categoryDTO);
    }

    @Override
    public boolean deleteCategory(int id) {
        return categoryRepositoryImp.deleteCategory(id);
    }

    @Override
    public CategoryDTO getCategoryById(int id) {
        return categoryRepositoryImp.getCategoryById(id);
    }
}
