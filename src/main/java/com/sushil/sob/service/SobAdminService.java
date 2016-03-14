package com.sushil.sob.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sushil.sob.dao.SobAdminDao;
import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobCustomer;

@Service
public class SobAdminService implements ISobAdminService{

	@Autowired
	private SobAdminDao dao;
	
	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public long verifyAccount(SobCustomer sob_customer) throws Exception {
		
		return dao.verifyAccount(sob_customer);
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
	public long verifyLoan(SobCustomer sob_customer) throws Exception {
		
		return dao.verifyAccount(sob_customer);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean rejectLoan(SobCustomer sob_customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public boolean transferAmount(SobAccount from_account,
			SobAccount to_account, double amount) throws Exception {
		// TODO Auto-generated method stub
		return dao.transferAmount(from_account, to_account, amount);
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public long annualLoanReport() throws Exception {
		// TODO Auto-generated method stub
		return dao.annualLoanReport();
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public long annualCreditReport() throws Exception {
		// TODO Auto-generated method stub
		return dao.annualCreditReport();
	}

	@Transactional(rollbackFor=Exception.class, timeout = 5, readOnly = false)
	@Override
	public long annualDebitReport() throws Exception {
		// TODO Auto-generated method stub
		return dao.annualDebitReport();
	}

}
