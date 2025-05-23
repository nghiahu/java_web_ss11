package com.example.session11.validator;

import com.example.session11.dto.CategoryDTO;
import com.example.session11.service.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class ValidatorCataName implements ConstraintValidator<ValidCataName, String> {
    @Autowired
    private CategoryServiceImp categoryServiceImp;

    @Override
    public boolean isValid(String string, ConstraintValidatorContext constraintValidatorContext) {
        CategoryDTO categoryDTO = categoryServiceImp.getCategoryByName(string);
        if (categoryDTO == null) {
            return true;
        }else {
            return false;
        }
    }
}
