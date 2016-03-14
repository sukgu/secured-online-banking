package com.sushil.sob.controller;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sushil.sob.model.SobLoan;

 
	@Controller
	public class HelloController {
	 
		
	
		
		
		@RequestMapping(value="/user_loan", method=RequestMethod.GET)
		public ModelAndView showLoginForm() 
		{
			SobLoan sc=new SobLoan();
			return new ModelAndView("user_loan", "submitLoanRequest", sc);
		}
		
		
		@RequestMapping(value ="/loan", method = RequestMethod.POST)
		public String processDetail(@Valid @ModelAttribute("submitLoanRequest") SobLoan c,BindingResult res, Model m,HttpSession hs) throws Exception 
		{
			System.out.println(m);
			if (res.hasFieldErrors("amount")) 
			{
				return "user_loan";
			}
			//String validCustomer = .addCustomer(c);
			//System.out.println(validCustomer);
			return "user";
		}
		
		
		@RequestMapping(value="/access_denied", method=RequestMethod.GET)
		public String access(ModelMap model)
		{
			return "access_denied";
		}
		
		
		
		@RequestMapping(value="/login", method=RequestMethod.GET)
		public String login(ModelMap model)
		{
			return "login";
		}
	 
		@RequestMapping(value="/loginfailed", method=RequestMethod.GET)
		public String loginerror(ModelMap model) {
	 
			model.addAttribute("error", "true");
			return "login";
	 
		}
		
		
		
		@RequestMapping(value="/logout", method=RequestMethod.GET)
		public String logout(ModelMap model) {
	 
			return "login";
	 
		}
	 
	}
	
	

