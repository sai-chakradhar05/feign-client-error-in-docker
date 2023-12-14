package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms2")
public class MyController {
	@Autowired
	FeignMs1 ms1;
	@GetMapping("/hello2")
	public String hello()
	{
		return "Hello, BOOT from MS2";
	}
	
	@GetMapping("/hello1")
	public String hello2()
	{
		return ms1.hello();
	}
}
