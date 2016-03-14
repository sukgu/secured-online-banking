package com.sushil.sob.dao;

import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobCustomer;

public interface ISobAdmin {

	
	long verifyAccount(SobCustomer sob_customer) throws Exception;
	boolean deleteAccount(SobAccount account) throws Exception;
	boolean deleteRequest(SobCustomer sob_customer) throws Exception;
	boolean deactivateAccount(SobCustomer sob_customer) throws Exception;
	long verifyLoan(SobCustomer sob_customer) throws Exception;
	boolean rejectLoan(SobCustomer sob_customer) throws Exception;
	boolean transferAmount(SobAccount from_account,SobAccount to_account,double amount) throws Exception;
	long annualLoanReport() throws Exception;
	long annualCreditReport() throws Exception;
	long annualDebitReport() throws Exception;
	
	
}
