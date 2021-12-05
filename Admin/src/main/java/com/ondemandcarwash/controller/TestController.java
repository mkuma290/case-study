package com.ondemandcarwash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, from ADMIN";
		
	}

}
