package com.suyad.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gill")

public class MainController 
{
	@GetMapping("/wel")
	public String welcome()
	{
		String s = null;
		System.out.println(s.charAt(0));
		return "Hello Welcome message from Main Controller ";
	}
	@PostMapping("/wel")
	public String greet()
	{
		return "Hello Good Evening message from Main Controller";
	}
}
