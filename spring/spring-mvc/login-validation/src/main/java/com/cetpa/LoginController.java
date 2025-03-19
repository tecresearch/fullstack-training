package com.cetpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController 
{
	@GetMapping("login-form")
	public String getLoginView()
	{
		return "login.jsp";
	}
	@PostMapping("authenticate-user")
	public String authenticateUser(String uid,String pass,Model model)
	{
		if(uid.equals("admin") && pass.equals("cetpa"))
			return "home.jsp";
		model.addAttribute("msg","Authentication failed...");
		model.addAttribute("userid",uid);
		return "login.jsp";
	}
}
