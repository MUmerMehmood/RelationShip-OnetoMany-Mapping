package com.lostandfound.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lostfound")
public class FoundController {
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}

}
