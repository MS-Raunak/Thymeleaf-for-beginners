package com.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafInheritController {
	
	@RequestMapping("/inherits")
	public String getInherit(Model model) {
		return "inherit";
	}
}
