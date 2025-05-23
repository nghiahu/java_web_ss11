package com.example.session11.controller;

import com.example.session11.dto.UserEmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EmailController {
    @GetMapping("emailForm")
    public String emailForm(Model model) {
        model.addAttribute("email", new UserEmailDTO());
        return "emailForm";
    }
    @PostMapping("email-save")
    public String emailSave(@Valid @ModelAttribute("email") UserEmailDTO email, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "emailForm";
        }
        model.addAttribute("mess","Email hợp lệ");
        return "emailForm";
    }
}
