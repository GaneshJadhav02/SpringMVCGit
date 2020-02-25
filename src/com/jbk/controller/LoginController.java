package com.jbk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("i am in Const...");
	}
	
	@RequestMapping("/")
	public ModelAndView m1() {
		System.out.println("mapping of login.jsp");
		return new ModelAndView("login");
	}
	
	
}
