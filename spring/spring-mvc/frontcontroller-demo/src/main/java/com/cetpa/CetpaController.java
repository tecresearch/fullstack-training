package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CetpaController 
{
	//URL of this handler-->http://localhost:8080/frontcontroller-demo/cetpa
	@GetMapping("cetpa")
	public ModelAndView handleCetpa()
	{
		System.out.println("Cetpa handler of CETPA controller invoked...");		
		return null;
	}
	//URL of this handler-->http://localhost:8080/frontcontroller-demo/noida
	@GetMapping("noida")
	public ModelAndView handleNoida()
	{
		System.out.println("Noida handler CETPA controller  invoked...");		
		return null;
	}
}
