package com.example.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	
	@GetMapping("/getName")
	public String getName() {
		return "Hemanth Hema";
	}

}
