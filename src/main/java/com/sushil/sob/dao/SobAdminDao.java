package com.sushil.sob.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobCustomer;

@Repository
public class SobAdminDao implements ISobAdmin{
	
	@Autowired
	private SessionFactory sf;

	@Override
	public long verifyAccount(SobCustomer sob_customer) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean deactivateAccount(SobCustomer sob_customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long verifyLoan(SobCustomer sob_customer) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean rejectLoan(SobCustomer sob_customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public long annualLoanReport() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long annualCreditReport() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long annualDebitReport() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean deleteAccount(SobAccount account) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean deleteRequest(SobCustomer sob_customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean transferAmount(SobAccount from_account,
			SobAccount to_account, double amount) throws Exception {
		from_account.setBalance(from_account.getBalance()-amount);
		to_account.setBalance(to_account.getBalance()+amount);
		sf.getCurrentSession().update(from_account);
		sf.getCurrentSession().update(to_account);
		return false;
	}

}
