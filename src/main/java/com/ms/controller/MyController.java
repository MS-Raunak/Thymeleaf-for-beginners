package com.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	//http://localhost:8080/firsthymeleaf
	
	@RequestMapping("/firsthymeleaf")
	public String handler1(Model model) {  //sending data to the view thru model
		model.addAttribute("name", "Thymeleaf");
		model.addAttribute("msg", "jai shree ram");
		model.addAttribute("var", "Variable");
		return "firstThymeleaf";
	}
	

}
