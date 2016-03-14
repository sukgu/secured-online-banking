package com.sushil.sob.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the SOB_BRANCH database table.
 * 
 */
@Entity
@Table(name="SOB_BRANCH")
public class SobBranch  implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="branchcode")
	private long branchcode;

	@Column(name="address")
	private String address;

	@Column(name="name")
	private String name;

	//bi-directional many-to-one association to SobAccount
	@OneToMany(mappedBy="sobBranch")
	@Column(name="ACCOUNT_NO")
	private List<SobAccount> sobAccounts;

	//bi-directional many-to-one association to SobEmployee
	@OneToMany(mappedBy="sobBranch")
	@Column(name="id")
	private List<SobEmployee> sobEmployees;

	//bi-directional many-to-one association to SobLoan
	@OneToMany(mappedBy="sobBranch")
	@Column(name="LOAN_ID")
	private List<SobLoan> sobLoans;

    public SobBranch() {
    }

	public long getBranchcode() {
		return this.branchcode;
	}

	public void setBranchcode(long branchcode) {
		this.branchcode = branchcode;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SobAccount> getSobAccounts() {
		return this.sobAccounts;
	}

	public void setSobAccounts(List<SobAccount> sobAccounts) {
		this.sobAccounts = sobAccounts;
	}
	
	public List<SobEmployee> getSobEmployees() {
		return this.sobEmployees;
	}

	public void setSobEmployees(List<SobEmployee> sobEmployees) {
		this.sobEmployees = sobEmployees;
	}
	
	public List<SobLoan> getSobLoans() {
		return this.sobLoans;
	}

	public void setSobLoans(List<SobLoan> sobLoans) {
		this.sobLoans = sobLoans;
	}
	
}