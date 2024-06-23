package com.JavaFest.SFMS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SfmsController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/SignUp")
    public String SignUp() {
        return "SignUp";
    }

    @GetMapping("/ForgetPassword")
    public String ForgetPassword() {
        return "ForgetPassword";
    }
}
