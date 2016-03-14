package com.sushil.sob.model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SOB_TRANSACTION database table.
 * 
 */
@Entity
@Table(name="SOB_TRANSACTION")
public class SobTransaction implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transid")
	private Long transid;
	
	@Column(name="amount")
	private BigDecimal amount;

    @Temporal( TemporalType.DATE)
	@Column(name="TRANS_DATE")
	private Date transDate;

	@Column(name="TRANS_ID")
	private BigDecimal transId;

	@Column(name="type")
	private String type;

	//bi-directional many-to-one association to SobAccount
    @ManyToOne
	@JoinColumn(name="ACCOUNT_NO")
	private SobAccount sobAccount;

    public SobTransaction() {
    }

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getTransDate() {
		return this.transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public BigDecimal getTransId() {
		return this.transId;
	}

	public void setTransId(BigDecimal transId) {
		this.transId = transId;
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

	public Long getTransid() {
		return transid;
	}

	public void setTransid(Long transid) {
		this.transid = transid;
	}
	
}