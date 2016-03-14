package com.sushil.sob.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the NUSER database table.
 * 
 */
@Entity
@Table(name="NUSER")
public class SobUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private long userId;

	@Column(name="enabled")
	private int enabled;

	@Column(name="password")
	private String password;

	@Column(name="username")
	private String username;

	//bi-directional many-to-one association to NuserRule
	@OneToMany(mappedBy="nuser")
	@Column(name="USER_RULES_ID")
	private Set<SobUserRoles> nuserRules;

    public SobUser() {
    }

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<SobUserRoles> getNuserRules() {
		return this.nuserRules;
	}

	public void setNuserRules(Set<SobUserRoles> nuserRules) {
		this.nuserRules = nuserRules;
	}
	
}