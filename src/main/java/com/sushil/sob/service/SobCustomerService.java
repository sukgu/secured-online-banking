package com.sushil.sob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sushil.sob.dao.SobCustomerDao;
import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobLoan;
import com.sushil.sob.model.SobTransaction;
import com.sushil.sob.model.SobUser;
import com.sushil.sob.model.SobUserRoles;

@Service
public class SobCustomerService implements ISobCustomerService
{
	@Autowired
	private SobCustomerDao dao;
	

	//@Transactional(noRollbackFor=ArithmeticException.class, timeout = 5, readOnly = false)
	@Override
	public String addCustomer(SobCustomer c) throws Exception {
		return "id="+dao.addCustomer(c);
	}

	
	
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	//@Transactional(noRollbackFor=ArithmeticException.class, timeout = 5, readOnly = false)
	@Override
	public String addUser(SobUser su) throws Exception {
		
		return dao.addUser(su);
	}

	//@Transactional(noRollbackFor=ArithmeticException.class, timeout = 5, readOnly = false)
	@Override
	public String addUserRoles(SobUserRoles sur) throws Exception {
		
		return dao.addUserRoles(sur);
	}

	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Override
	@Transactional(noRollbackFor=Exception.class,timeout=5,readOnly=false)
	public String register(SobCustomer sob_cust, SobUser sob_user,
			SobUserRoles sob_user_roles) throws Exception {
		
		
		addCustomer(sob_cust);
		addUser(sob_user);
		addUserRoles(sob_user_roles);
		
		return "success";
	}

	//@PreAuthorize("isAuthenticated()")
	@Override
	public String cal() throws Exception {
		// TODO Auto-generated method stub
		return "me";
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean transferAmount(SobAccount from_account,
			SobAccount to_account, double amount) throws Exception {
		
		return dao.transferAmount(from_account, to_account, amount);
		
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public void applyLoan(SobLoan sob_loan) throws Exception {
		
		dao.applyLoan(sob_loan);
	}

	@Transactional(readOnly=true)
	@Override
	public String checkLoanStatus(SobAccount account) throws Exception {
		
		return dao.checkLoanStatus(account);
	}

	@Transactional(readOnly=true)
	@Override
	public double checkBalance(SobAccount account) throws Exception {
		
		return dao.checkBalance(account);
	}

	@Transactional(readOnly=true)
	@Override
	public List<SobTransaction> showTransaction(SobAccount account)
			throws Exception {
		
		return dao.showTransaction(account);
	}

	

}
