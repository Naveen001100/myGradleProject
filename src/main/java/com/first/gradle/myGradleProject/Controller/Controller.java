package com.first.gradle.myGradleProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/")
	public String getGitApi() {
		return restTemplate.getForObject("https://api.github.com/users/Zen", String.class);
	}

	@GetMapping("/greeting")
	public String getGreeting(){
		return "Hello World";
	}

	@GetMapping("/greetings")
	public String getGreetings(){
		return "Custom World";
	}

}
