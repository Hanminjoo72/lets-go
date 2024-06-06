package com.example.letsGo.controller.signUp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignupController {
    @GetMapping("/signup")
    public String getSignup() {
        return "signup/signup";
    }
}
