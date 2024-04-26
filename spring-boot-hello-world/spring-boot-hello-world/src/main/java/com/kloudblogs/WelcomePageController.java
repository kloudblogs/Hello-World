package com.kloudblogs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WelcomePageController {

    @Value("${api.url}")
    private String apiUrl;

    @GetMapping("/kloudblogs")
    public String welcomePage(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String welcomeMessage = restTemplate.getForObject(apiUrl + "/welcome", String.class);
        model.addAttribute("message", welcomeMessage);
        return "welcome";
    }
}

