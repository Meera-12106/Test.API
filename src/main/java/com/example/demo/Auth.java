package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth {
	@GetMapping("/Login")
	public String Login(){	
		return " Welcome to the Page";
	}
	
	@GetMapping("/Submit")
	public String Submit() {
		
		return "Form Submit";
	}
	
	
	
}
