package com.greatlearning.customermangment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerWelcomeController {
	

	@RequestMapping("/")
	public String listBooks(Model model) {

		return "welcome-page";
	}

}
