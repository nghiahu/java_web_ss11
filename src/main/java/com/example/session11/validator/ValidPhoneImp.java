package com.example.session11.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidPhoneImp implements ConstraintValidator<ValidPhone, String> {
    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
        if (phone == null) return false;
        return phone.matches("0\\d{9}");
    }
}
