package com.sushil.sob.controller;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sushil.sob.gen.Generator;
import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobUser;
import com.sushil.sob.model.SobUserRoles;
import com.sushil.sob.service.ISobCustomerService;

@Controller
public class SobCustomerRegister 
{
	@Autowired
	private ISobCustomerService cser;
	
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView showRegisterForm() 
	{
		SobCustomer sc=new SobCustomer();
		return new ModelAndView("register", "reg_cust", sc);
	}

	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processDetail(@Valid @ModelAttribute("reg_cust") SobCustomer c,BindingResult res, Model m,HttpSession hs) throws Exception 
	{
//		System.out.println(m);
//		System.out.println(c.getCity());
//		String validCustomer = cser.addCustomer(c);
//		System.out.println(validCustomer);
//		return "hello";
		if (res.hasFieldErrors("fname") || res.hasFieldErrors("lname")) 
		{
			return "register";
		}
		//String validCustomer=null;
		SobUser sob_user=new SobUser();
		SobUserRoles sob_user_roles=new SobUserRoles();
		Generator generator=new Generator(8);
		String user=generator.generateNoRepeat();
		String pass=generator.generateNoRepeat();
		//sob_user.setUserId(userId);
		sob_user.setUsername(user);
		
		sob_user.setPassword(pass);
		sob_user.setEnabled(0);
		c.setLpassword(pass);
		c.setLoginId(user);
		//cser.addUser(sob_user);
		sob_user_roles.setNuser(sob_user);
		sob_user_roles.setAuthority("ROLE_USER");
		//cser.addUserRoles(sob_user_roles);
		//validCustomer = cser.addCustomer(c);
		
		if(cser.register(c, sob_user, sob_user_roles)!=null)
		return "register_ok";
			return "register_err";
		
		
		
		
	}
}
