package com.sushil.sob.dao;
import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobLoan;
import com.sushil.sob.model.SobTransaction;
import com.sushil.sob.model.SobUser;
import com.sushil.sob.model.SobUserRoles;
@Repository
public class SobCustomerDao implements ISobCustomer
{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public String addCustomer(SobCustomer c) throws Exception 
	{	
		return "id="+sf.getCurrentSession().save(c);
	}

	@Override
	public String addUser(SobUser su) throws Exception {
		
		
		return "id="+sf.getCurrentSession().save(su);
	}

	@Override
	public String addUserRoles(SobUserRoles sur) throws Exception {
		
		return "id="+sf.getCurrentSession().save(sur);
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

	

	@Override
	public String checkLoanStatus(SobAccount account) throws Exception {
		List<String> list=sf.getCurrentSession().createQuery("select c.status from SobLoan c where c.sobAccount="+account).list();
		return list.get(0);
	}

	@Override
	public double checkBalance(SobAccount account) throws Exception {
		SobAccount sa= (SobAccount)sf.getCurrentSession().get(SobAccount.class, account.getAccountNo());
		return sa.getBalance();
	}

	@Override
	public List<SobTransaction> showTransaction(SobAccount account) throws Exception {
		List<SobTransaction> list=sf.getCurrentSession().createQuery("select c from SobTransaction c where c.sobAccount="+account).list();
		return list;
	}

	@Override
	public void applyLoan(SobLoan sob_loan) throws Exception {
		sf.getCurrentSession().save(sob_loan);
		
	}

	
	
	

	
}
