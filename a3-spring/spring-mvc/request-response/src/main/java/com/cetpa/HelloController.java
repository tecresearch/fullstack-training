package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	@GetMapping("hello")
	public ModelAndView getInputView()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("input.jsp");
		return modelAndView;
	}
	@GetMapping("sayhello")
	public ModelAndView getOutputView(String str)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("output.jsp");
		modelAndView.addObject("name",str);
		return modelAndView;
	}
}
