package com.kloudblogs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/kloudblogs/welcome")
    public String welcomeMessage() {
        return "Welcome to KloudBlogs!";
    }
}

