package com.kloudblogs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePageController {

	@GetMapping("/")
	public String welcomePage(Model model) {
		model.addAttribute("message", "Welcome to KloudBlogs!!!");
		return "welcome";
	}
}
