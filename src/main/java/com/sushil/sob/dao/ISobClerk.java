package com.sushil.sob.dao;

import java.util.List;

import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobBranch;
import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobEmployee;
import com.sushil.sob.model.SobLoan;

public interface ISobClerk {

	
	long verifyAccount(SobCustomer sob_customer,SobBranch sob_branch) throws Exception;
	boolean deleteAccount(SobAccount account) throws Exception;
	boolean deleteRequest(SobCustomer sob_customer) throws Exception;
	boolean deactivateAccount(SobCustomer sob_customer) throws Exception;
	long verifyLoan(SobLoan sob_loan) throws Exception;
	boolean rejectLoan(SobLoan sob_loan) throws Exception;
	List<SobLoan> checkLoanRequest() throws Exception;
	SobEmployee getEmployee(String loginid) throws Exception;
	List<SobCustomer> checkAccountRequest(SobEmployee employee) throws Exception;
	boolean transferAmount(SobAccount from_account,SobAccount to_account,double amount) throws Exception;
	SobCustomer getCustomer(long cust_id)throws Exception;
	SobBranch getBranch(long branchcode)throws Exception;
}
