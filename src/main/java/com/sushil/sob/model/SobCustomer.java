package com.sushil.sob.model;
import java.io.Serializable;
import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="SOB_CUST")
public class SobCustomer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8415449549495157880L;
	@Column
	private String account_type;
	
	@Column
	private long branchcode;
	
	@Column(name="salutation")
	private String salutation;
	
	@Column(name="id")
	private int adhaar;
	
	@Column(name="fname")
	private String fname;
	
	
	@Column(name="mname")
	private String mname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="faname")
	private String fatherName;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="gender")
	private String gender;
	

	@Column(name="education")
	private String education;
	

	@Column(name="occupation")
	private String occupation;
	

	@Column(name="mStatus")
	private String mStatus;
	
	@Column(name="gid")
	private long gid;
	
	
	@Column(name="city")
	private String city;
	
	@Column(name="pcity")
	private String pcity;
	

	@Column(name="address")
	private String address;
	
	@Column(name="paddress")
	private String paddress;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pstate")
	private String pstate;
	

	@Column(name="pincode")
	private long pincode;
	

	@Column(name="ppincode")
	private long ppincode;
	
	@Column(name="mobileNo")
	private long mobileNo;
	

	@Column(name="email")
	private String email;
	

	@Column(name="grossIncome")
	private long grossIncome;
	 
	@Column(name="status")	
	private String status="p";
	
	@Column(name="loginid")
	private String loginId;
	
	@NotEmpty
	@Column(name="lpassword")
	private String lpassword="shubham";
	
	@NotEmpty
	@Column(name="tpassword")
	private String tpassword="shubham";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Cust_Id")
	private long cust_id;
	
	@OneToMany(mappedBy="sobCustomer")
	@Column(name="ACCOUNT_NO")
	private List<SobAccount> sobAccounts;
	
	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public int getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(int adhaar) {
		this.adhaar = adhaar;
	}

	public long getCust_id() {
		return cust_id;
	}

	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}

	public long getGid() {
		return gid;
	}

	public void setGid(long gid) {
		this.gid = gid;
	}

	public long getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(long grossIncome) {
		this.grossIncome = grossIncome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getPpincode() {
		return ppincode;
	}

	public void setPpincode(long ppincode) {
		this.ppincode = ppincode;
	}

	public String getPstate() {
		return pstate;
	}

	public void setPstate(String pstate) {
		this.pstate = pstate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String string) {
		this.status = string;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLpassword() {
		return lpassword;
	}

	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}

	public String getTpassword() {
		return tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}

	public List<SobAccount> getSobAccounts() {
		return sobAccounts;
	}

	public void setSobAccounts(List<SobAccount> sobAccounts) {
		this.sobAccounts = sobAccounts;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public long getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(long branchcode) {
		this.branchcode = branchcode;
	}

}