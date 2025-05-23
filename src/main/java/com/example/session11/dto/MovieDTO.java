package com.example.session11.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;


public class MovieDTO {
    @NotBlank(message = "title không được để trống")
    private String title;
    @Email(message = "Email không hợp lệ")
    private String email;
    @Min(value = 1, message = "Số lượng phải lớn hơn 0")
    private int quantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEvent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Date dateEvent) {
        this.dateEvent = dateEvent;
    }
}
