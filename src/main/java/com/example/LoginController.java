package com.example;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class LoginController {

    @GetMapping("/")

    public String loginForm() {

        return "login";

    }

    @PostMapping("/login")

    public String login(@RequestParam String user, @RequestParam String password, Model model) {

        if ("siva".equals(user) && "12345".equals(password)) {

            model.addAttribute("message", "Welcome, " + user + "!");

            return "welcome";

        } else {

            model.addAttribute("message", "Invalid credentials");

            return "login";

        }

    }

}