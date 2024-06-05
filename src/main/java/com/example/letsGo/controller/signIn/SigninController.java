package com.example.letsGo.controller.signIn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signin")
public class SigninController {
    @GetMapping
    public String getSignin() {
        return "signin/signin";
    }
}
