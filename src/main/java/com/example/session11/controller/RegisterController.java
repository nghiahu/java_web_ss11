package com.example.session11.controller;

import com.example.session11.dto.RegisDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @GetMapping("registerForm")
    public String registerForm(Model model) {
        model.addAttribute("regisUser", new RegisDTO());
        return "registerForm";
    }

    @PostMapping("register")
    public String register(@Valid @ModelAttribute("regisUser") RegisDTO regisDTO, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registerForm";
        }else{
            model.addAttribute("mess","Đăngt ký thành công");
            return "registerForm";
        }
    }

}
