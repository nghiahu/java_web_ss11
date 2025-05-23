package com.example.session11.controller;

import com.example.session11.dto.PhoneDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping("phoneForm")
    public String phoneForm(Model model) {
        model.addAttribute("phone",new PhoneDTO());
        return "phoneForm";
    }

    @PostMapping("phone-save")
    public String phoneSave(@Valid @ModelAttribute("phone") PhoneDTO phone, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "phoneForm";
        }else {
            model.addAttribute("mess","Số điện thoại hợp lý");
            return "phoneForm";
        }
    }
}
