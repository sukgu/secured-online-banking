package com.sushil.sob.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobEmployee;
import com.sushil.sob.service.ISobClerkServive;
import com.sushil.sob.service.SobCustomerService;

@Controller
public class SobExtraController
{
	@Autowired
	ISobClerkServive service;
	
	@RequestMapping("/admin")
	public String showAdmin() 
	{
		return "admin";
	}
	@RequestMapping("/clerk")
	public String showClerk(Principal p,ModelMap model) throws Exception 
	{
		
		model.addAttribute("clerk", p.getName());
		return "clerk";
	}
	@RequestMapping("/clerk_account_request")
	public String showClerkRequests(ModelMap model,Principal p) throws Exception
	{
		model.addAttribute("list", service.checkAccountRequest(service.getEmployee(p.getName())));
		return "clerk_account_request";
	}
	/*@RequestMapping("/user")
	public String showUser() 
	{
		return "user";
	}*/
	@RequestMapping("/about_us")
	public String showAboutUs() 
	{
		return "about_us";
	}
	@RequestMapping("/login")
	public String showLogin() 
	{
		return "login";
	}
	
	@RequestMapping("/contact")
	public String showContact() 
	{
		return "contact";
	}
	
	@RequestMapping("/feedback")
	public String showFeedback() 
	{
		return "feedback";
	}
	@RequestMapping("/link")
	public String showLink() 
	{
		return "link";
	}
	@RequestMapping("/resources")
	public String showResources() 
	{
		return "resources";
	}
	
	@PreAuthorize("hasRole('ROLE_USER')")
	@RequestMapping("/services")
	public String showServices() 
	{
		return "services";
	}
	@RequestMapping("/whatsnew")
	public String showWhatsnew() 
	{
		return "whatsnew";
	}
	@RequestMapping("/approve_account")
	public String approveAccount(@RequestParam(value="id") String id) throws Exception
	{
		long cust_id=Long.parseLong(id);
		SobCustomer sob_customer=service.getCustomer(cust_id);
		service.verifyAccount(sob_customer,service.getBranch(sob_customer.getBranchcode()));
		return "clerk_account_request";
	}
	@RequestMapping("/reject_account")
	public String rejectAccount(@RequestParam(value="id") String id) throws Exception
	{
		long cust_id=Long.parseLong(id);
		SobCustomer sob_customer=service.getCustomer(cust_id);
		service.deactivateAccount(sob_customer);
		return "clerk_account_request";
	}
	@RequestMapping("/delete_account")
	public String deleteAccount(@RequestParam(value="id") String id) throws Exception
	{
		long cust_id=Long.parseLong(id);
		SobCustomer sob_customer=service.getCustomer(cust_id);
		service.deleteRequest(sob_customer);
		return "clerk_account_request";
	}
	@RequestMapping("/calculate")
	@Secured(value="isAnonymous()")
	public String ghgh(ModelMap model)
	{
		String t=null;
		SobCustomerService s=new SobCustomerService();
		try{
		t=s.cal();
		}catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("t", t);
		model.addAttribute("sushil","sushil");
		return "services";
	}
	
}
