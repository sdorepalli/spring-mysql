package com.spring.mysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/mysql")
public class MySqlController {

	@GetMapping
	public String get() {
		return "I am from get";
	}
}
