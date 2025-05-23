package com.example.session11.controller;

import com.example.session11.dto.EvaluateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EvaluateController {
    @GetMapping("evaluteForm")
    public String evaluteForm(Model model) {
        model.addAttribute("evaluate",new EvaluateDTO());
        return "evaluateForm";
    }
    @PostMapping("evaluate-save")
    public String evaluteSave(@Valid @ModelAttribute("evaluate") EvaluateDTO evaluateDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "evaluateForm";
        }else{
            model.addAttribute("mess","Đánh giá thành công");
            return "evaluateForm";
        }
    }
}
