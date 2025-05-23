package com.example.session11.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
    @NotNull(message = "Name không được để trống")
    @Size(min = 2, max = 30,message = "Độ dài chuỗi không hợp lệ")
    private String name;
    @NotNull(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;
    @NotNull(message = "Password không được để trống")
    @Size(min = 2, max = 30,message = "Độ dài chuỗi không hợp lệ")
    private String password;
    @NotNull(message = "Phone không được để trống")
    private String phone;
    private boolean status;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
