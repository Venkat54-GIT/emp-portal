package com.sbms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@GetMapping("/")
	public String getIndexpage() {
		return "Welcome";
	}
	
	@GetMapping("/msg")
	public String getMsg() {
		return "Hi there ";
	}
}
