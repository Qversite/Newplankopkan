package com.example.demo333.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/main")
    public String mainPage() {
        return "main"; // Вернёт шаблон main.html
    }

    @GetMapping("/profile")
    public String profilePage() {
        return "profile"; // Вернёт шаблон profile.html
    }
}

