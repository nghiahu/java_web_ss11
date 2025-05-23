package com.example.session11.controller;

import com.example.session11.dto.MovieDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MovieController {

    @GetMapping("movie")
    public String movieForm(Model model) {
        model.addAttribute("MovieDTO", new MovieDTO());
        return "movieForm";
    }

    @PostMapping("movie-save")
    public String validateForm(
            @Valid @ModelAttribute("MovieDTO") MovieDTO movieDTO,
            BindingResult result) {
        return "movieForm";
    }
}
