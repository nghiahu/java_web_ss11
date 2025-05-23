package com.example.session11.dto;

import com.example.session11.validator.AdminGroup;
import com.example.session11.validator.UserGroup;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AccountDTO {
    @NotBlank(message = "Tên không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String name;

    @Email(message = "Email không hợp lệ", groups = {AdminGroup.class, UserGroup.class})
    @NotBlank(message = "Email không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String email;

    @NotBlank(message = "Vai trò không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String role;

    @NotBlank(message = "Mã xác minh bắt buộc với admin", groups = AdminGroup.class)
    private String verificationCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
