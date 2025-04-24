package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController 
{
	//URL of this handler-->http://localhost:8080/frontcontroller-demo/demo
	@GetMapping("demo")
	public ModelAndView handleDemo()
	{
		System.out.println("Demo handler of DEMO controller invoked...");		
		return null;
	}
	//URL of this handler-->http://localhost:8080/frontcontroller-demo/hello
	@GetMapping("hello")
	public ModelAndView handleHello()
	{
		System.out.println("Hello handler DEMMO controller  invoked...");		
		return null;
	}
}
