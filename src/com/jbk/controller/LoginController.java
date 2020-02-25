package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.service.loginService;

@Controller
public class LoginController {
	
	@Autowired
	loginService loginservice;

	public LoginController() {
		System.out.println("i am in Const...");
	}
	
	@RequestMapping("/")
	public ModelAndView m1() {
		System.out.println("mapping of login.jsp");
		loginservice.getStudent();
		
		return new ModelAndView("login");
	}
	
	
}
