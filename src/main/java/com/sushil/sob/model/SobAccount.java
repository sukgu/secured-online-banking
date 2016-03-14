package com.sushil.sob.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="SOB_ACCOUNT")
public class SobAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACCOUNT_NO")
	private long accountNo;

	@Column(name="balance")
	private double balance;

    @Temporal( TemporalType.DATE)
	@Column(name="CLOSE_DATE")
	private Date closeDate;

    @Temporal( TemporalType.DATE)
	@Column(name="OPEN_DATE")
	private Date openDate;

	@Column(name="type")
	private String type;

	//bi-directional many-to-one association to SobBranch
    @ManyToOne
	@JoinColumn(name="branchcode")
	private SobBranch sobBranch;

	//bi-directional many-to-one association to SobCustomer
    @ManyToOne
	@JoinColumn(name="loginid")
	private SobCustomer sobCustomer;

//	//bi-directional many-to-one association to SobCustomer
//	@OneToMany(mappedBy="sobAccount")
//	private List<SobCustomer> sobCustomers;

	//bi-directional many-to-one association to SobLoan
	@OneToMany(mappedBy="sobAccount")
	@Column(name="LOAN_ID")
	private List<SobLoan> sobLoans;

	//bi-directional many-to-one association to SobTransaction
	@OneToMany(mappedBy="sobAccount")
	@Column(name="transid")
	private List<SobTransaction> sobTransactions;

    public SobAccount() {
    }

	public long getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double new_from_balance) {
		this.balance = new_from_balance;
	}

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Date getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SobBranch getSobBranch() {
		return this.sobBranch;
	}

	public void setSobBranch(SobBranch sobBranch) {
		this.sobBranch = sobBranch;
	}
	
	public SobCustomer getSobCustomer() {
		return this.sobCustomer;
	}

	public void setSobCustomer(SobCustomer sobCustomer) {
		this.sobCustomer = sobCustomer;
	}
	
//	public List<SobCustomer> getSobCustomers() {
//		return this.sobCustomers;
//	}
//
//	public void setSobCustomers(List<SobCustomer> sobCustomers) {
//		this.sobCustomers = sobCustomers;
//	}
	
	public List<SobLoan> getSobLoans() {
		return this.sobLoans;
	}

	public void setSobLoans(List<SobLoan> sobLoans) {
		this.sobLoans = sobLoans;
	}
	
	public List<SobTransaction> getSobTransactions() {
		return this.sobTransactions;
	}

	public void setSobTransactions(List<SobTransaction> sobTransactions) {
		this.sobTransactions = sobTransactions;
	}
	
}