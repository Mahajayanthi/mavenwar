package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	@RequestMapping("/")
	public String hello() {
		return "welcome to stg";
	}

}