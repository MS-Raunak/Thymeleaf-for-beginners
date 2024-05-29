package com.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class ThymeleafInheritController {
	
	@RequestMapping("/inherits")
	public String getInherit(org.springframework.ui.Model model) {
		return "inherit";
	}
}
