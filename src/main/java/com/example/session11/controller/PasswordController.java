package com.example.session11.controller;

import com.example.session11.dto.UserPasswordDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PasswordController {
    @GetMapping("passwordForm")
    public String passwordForm(Model model) {
        model.addAttribute("passwordForm", new UserPasswordDTO());
        return "passwordForm";
    }
    @PostMapping("password-save")
    public String savePass(@Valid @ModelAttribute("passwordForm") UserPasswordDTO password, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "passwordForm";
        }else{
            model.addAttribute("mess","Mật khẩu hợp lệ");
            return "passwordForm";
        }
    }
}
