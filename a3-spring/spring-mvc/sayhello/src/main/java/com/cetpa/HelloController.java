package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	/*@GetMapping("hello")
	public ModelAndView getHomeView()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("input.jsp");
		return modelAndView;
	}
	@GetMapping("sayhello")
	public ModelAndView sayHelloToUser(String str)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name",str);
		modelAndView.setViewName("output.jsp");
		return modelAndView;
	}*/
	@GetMapping("hello")
	public String getHomeView()
	{
		return "input.jsp";
	}
	@GetMapping("sayhello")
	public String sayHelloToUser(String str,Model model)
	{
		model.addAttribute("name",str);
		return "output.jsp";
	}
}
