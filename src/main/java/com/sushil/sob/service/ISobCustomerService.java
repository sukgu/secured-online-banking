package com.sushil.sob.service;

import java.util.List;

import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobLoan;
import com.sushil.sob.model.SobTransaction;
import com.sushil.sob.model.SobUser;
import com.sushil.sob.model.SobUserRoles;

public interface ISobCustomerService 
{
	
	String addCustomer(SobCustomer c) throws Exception;
	String addUser(SobUser su) throws Exception;
	String addUserRoles(SobUserRoles sur) throws Exception;
	boolean transferAmount(SobAccount from_account,SobAccount to_account,double amount) throws Exception;
	void applyLoan(SobLoan sob_loan) throws Exception;
	String checkLoanStatus(SobAccount account) throws Exception;
	double checkBalance(SobAccount account) throws Exception;
	List<SobTransaction> showTransaction(SobAccount account) throws Exception;
	
	
	String cal() throws Exception;
	String register(SobCustomer sob_cust,SobUser sob_user,SobUserRoles sob_user_roles) throws Exception;
}
