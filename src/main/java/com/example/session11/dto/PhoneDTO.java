package com.example.session11.dto;

import com.example.session11.validator.ValidPhone;

import javax.validation.constraints.NotBlank;

public class PhoneDTO {
    @NotBlank(message = "Sô điện thoại không được để trống")
    @ValidPhone
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
