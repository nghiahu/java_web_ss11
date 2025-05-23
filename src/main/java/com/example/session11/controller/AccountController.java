package com.example.session11.controller;

import com.example.session11.dto.AccountDTO;
import com.example.session11.validator.AdminGroup;
import com.example.session11.validator.UserGroup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Controller
public class AccountController {
    @GetMapping("registerRole")
    public String registerRole(Model model) {
        model.addAttribute("account", new AccountDTO());
        return "registerRole";
    }

    @PostMapping("role-regiter")
    public String roleRegiter(@Valid @ModelAttribute("account") AccountDTO account, BindingResult bindingResult,Model model) {
        Class<?> validationGroup = account.getRole() != null && account.getRole().equals("admin") ? AdminGroup.class : UserGroup.class;

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<AccountDTO>> violations = validator.validate(account, validationGroup);

        for (ConstraintViolation<AccountDTO> violation : violations) {
            bindingResult.rejectValue(violation.getPropertyPath().toString(), "", violation.getMessage());
        }
        if (bindingResult.hasErrors()) {
            return "registerRole";
        }else {
            model.addAttribute("mess", "Đăng ký thành công");
            return "registerRole";
        }
    }
}
