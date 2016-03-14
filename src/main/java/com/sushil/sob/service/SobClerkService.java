package com.sushil.sob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sushil.sob.dao.ISobClerk;
import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobBranch;
import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobEmployee;
import com.sushil.sob.model.SobLoan;

@Service
public class SobClerkService implements ISobClerkServive{

	@Autowired
	ISobClerk dao;
	
	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public long verifyAccount(SobCustomer sob_customer,SobBranch sob_branch) throws Exception {
		
		return dao.verifyAccount(sob_customer,sob_branch);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean deleteAccount(SobAccount account) throws Exception {
		
		return dao.deleteAccount(account);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean deleteRequest(SobCustomer sob_customer) throws Exception {
		
		return dao.deleteRequest(sob_customer);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean deactivateAccount(SobCustomer sob_customer) throws Exception {
		
		return dao.deactivateAccount(sob_customer);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public long verifyLoan(SobLoan sob_loan) throws Exception {
		
		return dao.verifyLoan(sob_loan);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean rejectLoan(SobLoan sob_loan) throws Exception {
		
		return dao.rejectLoan(sob_loan);
	}

	@Transactional(readOnly=true)
	@Override
	public List<SobLoan> checkLoanRequest() throws Exception {
		
		return dao.checkLoanRequest();
	}

	@Transactional(readOnly=true)
	@Override
	public List<SobCustomer> checkAccountRequest(SobEmployee employee) throws Exception {
		
		return dao.checkAccountRequest(employee);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean transferAmount(SobAccount from_account,
			SobAccount to_account, double amount) throws Exception {

		return dao.transferAmount(from_account, to_account, amount);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public SobEmployee getEmployee(String loginid) throws Exception {
		
		return dao.getEmployee(loginid);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public SobCustomer getCustomer(long cust_id) throws Exception {
		// TODO Auto-generated method stub
		return dao.getCustomer(cust_id);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public SobBranch getBranch(long branchcode) throws Exception {
		// TODO Auto-generated method stub
		return dao.getBranch(branchcode);
	}

}
