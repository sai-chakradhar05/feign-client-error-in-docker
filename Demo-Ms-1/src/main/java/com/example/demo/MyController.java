package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class MyController {
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello, BOOT in MS1";
	}
}
