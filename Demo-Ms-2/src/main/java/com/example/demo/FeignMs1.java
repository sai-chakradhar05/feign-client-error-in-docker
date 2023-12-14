package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Ms1-Demo")
public interface FeignMs1 {
	
	@GetMapping("/ms1/hello")
	public String hello();
}
