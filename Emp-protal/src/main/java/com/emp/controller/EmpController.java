package com.emp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@GetMapping(value="/")
	public String getWelcomeMessage() {
		return "**Welcome to Emp Portal**";
	}
}
