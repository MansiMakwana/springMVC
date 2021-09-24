package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.pojo.Login;
import com.lti.service.LoginService;

@Controller
public class MyController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/getLogin")
	public ModelAndView getLogin()
	{
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("login", new Login());
		return mv;
	}
	
	
	@RequestMapping("/validateLogin")
	public ModelAndView validateLogin(@ModelAttribute("login") Login login)
	{
		System.out.println(login.getLoginname()+" "+login.getPassword());
		boolean res=loginService.validateLogin(login);
		if (res)
			return new ModelAndView("home");
		else
		{
			ModelAndView mv=new ModelAndView("login");
			mv.addObject("login", new Login());
			return mv;
		}
	}
	
	@RequestMapping("/getLogin/profile")
	
		public String getProfile()
		{
			return "profile";
		}
		
	
	

}
