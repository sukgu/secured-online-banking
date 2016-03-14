package com.sushil.sob.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SOB_EMPLOYEE database table.
 * 
 */
@Entity
@Table(name="SOB_EMPLOYEE")
public class SobEmployee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String loginid;
	
	@NotEmpty
	@Column(name="password")
	private String password;

	@Column(name="address")
	private String address;

	@Column(name="age")
	private BigDecimal age;

	@Column(name="designation")
	private String designation;

	@Column(name="fname")
	private String fname;

	@Column(name="gender")
	private String gender;

    @Temporal( TemporalType.DATE)
	@Column(name="HIRE_DATE")
	private Date hireDate;

    @Column(name="lname")
	private String lname;

	@Column(name="MGR_ID")
	private BigDecimal mgrId;

	@Column(name="mname")
	private String mname;

	//bi-directional many-to-one association to SobBranch
    @ManyToOne
	@JoinColumn(name="branchcode")
	private SobBranch sobBranch;

    public SobEmployee() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getAge() {
		return this.age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public BigDecimal getMgrId() {
		return this.mgrId;
	}

	public void setMgrId(BigDecimal mgrId) {
		this.mgrId = mgrId;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public SobBranch getSobBranch() {
		return this.sobBranch;
	}

	public void setSobBranch(SobBranch sobBranch) {
		this.sobBranch = sobBranch;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	
}