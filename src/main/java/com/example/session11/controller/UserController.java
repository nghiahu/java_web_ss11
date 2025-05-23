package com.example.session11.controller;

import com.example.session11.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("formUser")
    public String formUser(Model model) {
        model.addAttribute("user", new UserDTO());
        return "userForm";
    }

    @PostMapping("user-save")
    public String saveUser(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "userForm";
        }else
            model.addAttribute("mess","Nhập thông tin thành công");
        return "userForm";
    }
}
