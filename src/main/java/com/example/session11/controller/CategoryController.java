package com.example.session11.controller;

import com.example.session11.dto.CategoryDTO;
import com.example.session11.service.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class CategoryController {
    @Autowired
    private CategoryServiceImp categoryServiceImp;
    @GetMapping("listCategory")
    public String listCategory(Model model) {
        model.addAttribute("categories", categoryServiceImp.getAllCategories());
        return "listCategory";
    }
    @GetMapping("addCategory")
    public String showAddForm(Model model) {
        model.addAttribute("category", new CategoryDTO());
        return "addCategory";
    }
    @PostMapping("category-save")
    public String saveCategory(@Valid @ModelAttribute("category") CategoryDTO categoryDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addCategory";
        }else {
            categoryServiceImp.addCategory(categoryDTO);
            return "redirect:/listCategory";
        }
    }
    @GetMapping("/editCategory")
    public String showEditForm(@RequestParam("id") int id, Model model) {
        CategoryDTO category = categoryServiceImp.getCategoryById(id);
        model.addAttribute("category", category);
        return "addCategory";
    }
    @PostMapping("updateCategory")
    public String updateCategory(@Valid @ModelAttribute("category") CategoryDTO categoryDTO, BindingResult bindingResult) {
        CategoryDTO existing = categoryServiceImp.getCategoryById(categoryDTO.getId());
        CategoryDTO duplicate = categoryServiceImp.getCategoryByName(categoryDTO.getCategoryName());

        if (duplicate != null && duplicate.getId() != categoryDTO.getId()) {
            bindingResult.rejectValue("categoryName", "error.category", "Tên danh mục đã tồn tại");
        }

        if (bindingResult.hasErrors()) {
            return "addCategory";
        }

        categoryServiceImp.updateCategory(categoryDTO);
        return "redirect:/listCategory";
    }
    @GetMapping("/deleteCategory")
    public String deleteCategory(@RequestParam("id") int id) {
        categoryServiceImp.deleteCategory(id);
        return "redirect:/listCategory";
    }
}
