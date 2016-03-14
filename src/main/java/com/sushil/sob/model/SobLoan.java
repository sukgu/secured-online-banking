package com.sushil.sob.model;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


/**
 * The persistent class for the SOB_LOAN database table.
 * 
 */
@Entity
@Table(name="SOB_LOAN")
public class SobLoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOAN_ID")
	private long loanId;

	@NotNull
	@Column(name="amount")
	private BigDecimal amount;

    @Temporal( TemporalType.DATE)
    @Column(name="dateloangiven")
	private Date dateloangiven;

	@Column(name="INTEREST_RATE")
	private BigDecimal interestRate;

	@Column(name="type")
	private String type;
	
	@Column(name="status")
	private String status;

	//bi-directional many-to-one association to SobAccount
    @ManyToOne
	@JoinColumn(name="ACCOUNT_NO")
	private SobAccount sobAccount;

	//bi-directional many-to-one association to SobBranch
    @ManyToOne
	@JoinColumn(name="branchcode")
	private SobBranch sobBranch;

	//bi-directional many-to-one association to SobLoanpayment
	@OneToMany(mappedBy="sobLoan")
	@Column(name="loanpayid")
	private List<SobLoanPayment> sobLoanpayments;

    public SobLoan() {
    }

	public long getLoanId() {
		return this.loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDateloangiven() {
		return this.dateloangiven;
	}

	public void setDateloangiven(Date dateloangiven) {
		this.dateloangiven = dateloangiven;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SobAccount getSobAccount() {
		return this.sobAccount;
	}

	public void setSobAccount(SobAccount sobAccount) {
		this.sobAccount = sobAccount;
	}
	
	public SobBranch getSobBranch() {
		return this.sobBranch;
	}

	public void setSobBranch(SobBranch sobBranch) {
		this.sobBranch = sobBranch;
	}
	
	public List<SobLoanPayment> getSobLoanpayments() {
		return this.sobLoanpayments;
	}

	public void setSobLoanpayments(List<SobLoanPayment> sobLoanpayments) {
		this.sobLoanpayments = sobLoanpayments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}