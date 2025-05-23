package com.example.session11.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatorCataName implements ConstraintValidator<ValidCataName, String> {
    @Override
    public boolean isValid(String string, ConstraintValidatorContext constraintValidatorContext) {

        return false;
    }
}
