package com.laptrinhjavaweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.repository.HelloWorldRepository;

@RestController
public class HelloWorldController {
	
	@Autowired
	private HelloWorldRepository helloWorldRepository;
	
	@GetMapping("/hello")
	public String hello() {
		return helloWorldRepository.findById(1L).get().getValue();
	}
}
