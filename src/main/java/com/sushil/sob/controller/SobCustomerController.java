package com.sushil.sob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sushil.sob.service.ISobCustomerService;


@Controller
public class SobCustomerController 
{
	@Autowired
	private ISobCustomerService cser;

	@RequestMapping(value="/validate", method=RequestMethod.GET)
	public String showLoginForm() 
	{
		return "login";
	}
	
	@RequestMapping(value="/home")
	public String showHomeForm() 
	{
		return "home";
	}


	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userHome(ModelMap model)
	{
		return "user";
	}
	
	
	
}
