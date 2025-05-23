package com.example.session11.dto;

import javax.validation.constraints.*;

public class EvaluateDTO {
    @NotBlank(message = "tên không được để trống")
    private String username;
    @NotNull(message = "email không được để trống")
    private String email;
    @Min(value = 1,message = "Đánh giá từ 1 tới 5") @Max(value = 5,message = "Đánh giá từ 1 tới 5")
    private int evaluate;
    @Size(max = 200, message = "Đánh giá tối đa 200 ký tự")
    private String comment;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(int evaluate) {
        this.evaluate = evaluate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
