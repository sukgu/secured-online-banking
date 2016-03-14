package com.sushil.sob.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NUSER_RULES database table.
 * 
 */
@Entity
@Table(name="NUSER_RULES")
public class SobUserRoles implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_RULES_ID")
	private long userRulesId;

	@Column(name="authority")
	private String authority;

	//bi-directional many-to-one association to Nuser
    @ManyToOne
	@JoinColumn(name="USER_ID")
	private SobUser nuser;

    public SobUserRoles() {
    }

	public long getUserRulesId() {
		return this.userRulesId;
	}

	public void setUserRulesId(long userRulesId) {
		this.userRulesId = userRulesId;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public SobUser getNuser() {
		return this.nuser;
	}

	public void setNuser(SobUser nuser) {
		this.nuser = nuser;
	}
	
}