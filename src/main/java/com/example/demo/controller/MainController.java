package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Controller;

@Controller
public class MainController {

    @GetMapping("/")
    public String showLoginPage() {
        return "index";
    }

}
