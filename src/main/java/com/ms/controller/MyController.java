package com.ms.controller;

import java.util.List;

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
	
	//Iterator handler
	@RequestMapping("/loop")
	public String iterator(Model model) {
		List<String> nameslist = List.of("Chhaya", "Shanaya", "MS", "Ronu", "Ritesh");
		model.addAttribute("names", nameslist);
		return "iterate";
	}
	

}
