package com.example.session11.dto;

import com.example.session11.validator.ValidPassword;

public class UserPasswordDTO {
    @ValidPassword
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
