package com.example.session11.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryDTO {
    private int id;
    @NotBlank(message = "Tên danh mục không được để trống")
    @Size(max = 50, message = "Tối đa 50 ký tự")
    private String categoryName;
    private boolean status;

    public CategoryDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
