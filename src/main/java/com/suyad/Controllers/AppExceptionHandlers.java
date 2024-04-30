package com.suyad.Controllers;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class AppExceptionHandlers
{
	
	
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e)
	{
		return "Sorry Something went wrong";
		
	}
}
