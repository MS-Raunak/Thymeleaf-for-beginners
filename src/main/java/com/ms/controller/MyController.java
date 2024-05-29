package com.ms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	//http://localhost:8080/firsthymeleaf
	
	//handler for displaying data, declaring variable, rendering dynamic data
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
	
	//Conditional handler
	@RequestMapping("/conditional")
	public String conditional(Model model) {
		model.addAttribute("isActive", true);
		model.addAttribute("gender", "M");
		
		List<Integer> listOfNumbers = List.of(10,20,30,40,50);
		model.addAttribute("numberList", listOfNumbers);
		
		return "conditional";
	}
	
	//Fragments handler
	@RequestMapping("/fragments")
	public String getFragments() {
		return "fragments";
	}

}
