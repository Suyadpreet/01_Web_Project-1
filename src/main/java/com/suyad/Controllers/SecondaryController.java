package com.suyad.Controllers;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/suyad")
public class SecondaryController 
{
	
	@GetMapping("/wel")
	public String welcome(RedirectAttributes redirectAttributes)
	{
		//int i = 10/0;
		redirectAttributes.addAttribute("msg", "Suyadpreet");
		return "redirect:/suyad/indx";
	}
	
	
	@GetMapping("/indx")
	@ResponseBody
	public String getindx(RedirectAttributes redirectAttributes)
	{
		System.out.println("Request come to getindex method");
		//int i = 10/0;
		System.out.println(redirectAttributes.containsAttribute("msg"));
		return "Hello index from secondary controller ";
	}
	
	@PostMapping("/wel")
	public String greet()
	{
		return "Hello Good Evening from secondary controller";
	}
	
}
