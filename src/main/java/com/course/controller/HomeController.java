package com.course.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
