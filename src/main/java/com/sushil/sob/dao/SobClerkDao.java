package com.sushil.sob.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sushil.sob.model.SobAccount;
import com.sushil.sob.model.SobBranch;
import com.sushil.sob.model.SobCustomer;
import com.sushil.sob.model.SobEmployee;
import com.sushil.sob.model.SobLoan;
import com.sushil.sob.model.SobUser;

@Repository
public class SobClerkDao implements ISobClerk{
	
	
	@Autowired
	private SessionFactory sf;

	@Override
	public long verifyAccount(SobCustomer sob_customer,SobBranch sob_branch) throws Exception {
		sob_customer.setStatus("v");
		sf.getCurrentSession().update(sob_customer);
		SobAccount account=new SobAccount();
		//account.setOpenDate();
		account.setType(sob_customer.getAccount_type());
		account.setSobCustomer(sob_customer);
		account.setSobBranch(sob_branch);
		sf.getCurrentSession().save(account);
		SobUser su=(SobUser)sf.getCurrentSession().createQuery("select c from SobUser c where c.username = :lid").setParameter("lid", sob_customer.getLoginId()).uniqueResult();
		su.setEnabled(1);
		sf.getCurrentSession().update(su);
		
		return 0;
	}

	@Override
	public boolean deactivateAccount(SobCustomer sob_customer) throws Exception {
		
		SobUser su=(SobUser)sf.getCurrentSession().createQuery("select c from SobUser c where c.username = :lid").setParameter("lid", sob_customer.getLoginId()).uniqueResult();
		su.setEnabled(0);
		sf.getCurrentSession().update(su);
		
		return false;
	}


	

	@Override
	public boolean deleteAccount(SobAccount account) throws Exception {
		sf.getCurrentSession().delete(account);
		return true;
	}
	
	@Override
	public boolean deleteRequest(SobCustomer sob_customer) throws Exception {
			sf.getCurrentSession().delete(sob_customer);
			return true;
			
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
	public List<SobLoan> checkLoanRequest() throws Exception {
		String hql="select c from SobLoan c where c.status=:status";
		List<SobLoan> list=sf.getCurrentSession().createQuery(hql).setParameter("status", "p").list();
		return list;
	}

	@Override
	public List<SobCustomer> checkAccountRequest(SobEmployee employee) throws Exception {
		String hql="select c from SobCustomer c where c.status=:status and c.branchcode=:branchcode";
		List<SobCustomer> list=sf.getCurrentSession().createQuery(hql).setParameter("status", "p").setParameter("branchcode", employee.getSobBranch().getBranchcode()).list();
		return list;
	}

	@Override
	public long verifyLoan(SobLoan sob_loan) throws Exception {
		sob_loan.setStatus("v");
		sf.getCurrentSession().update(sob_loan);
		return 0;
	}

	@Override
	public boolean rejectLoan(SobLoan sob_loan) throws Exception {
		sf.getCurrentSession().delete(sob_loan);
		return true;
	}

	@Override
	public SobEmployee getEmployee(String loginid) throws Exception {
		String hql="select c from SobEmployee c where c.loginid=:id";
		SobEmployee se= (SobEmployee)sf.getCurrentSession().createQuery(hql).setParameter("id", loginid).uniqueResult();
		return se;
	}

	@Override
	public SobCustomer getCustomer(long cust_id) throws Exception {
		// TODO Auto-generated method stub
		return (SobCustomer)sf.getCurrentSession().get(SobCustomer.class, cust_id);
	}

	@Override
	public SobBranch getBranch(long branchcode) throws Exception {
		// TODO Auto-generated method stub
		return (SobBranch)sf.getCurrentSession().get(SobBranch.class, branchcode);
	}

	

}
