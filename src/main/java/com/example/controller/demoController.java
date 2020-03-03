package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

	@RequestMapping("/demo")
	public String show() {
		return "HELLO DOCKER";
	}
}
