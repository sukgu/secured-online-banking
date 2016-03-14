package com.sushil.sob.model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SOB_LOANPAYMENT database table.
 * 
 */
@Entity
@Table(name="SOB_LOANPAYMENT")
public class SobLoanPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="loanpayid")
	private Long loanpayid; 
	
	@Column(name="capitalpaid")
	private BigDecimal capitalpaid;

	@Column(name="interestpaid")
	private BigDecimal interestpaid;

    @Temporal( TemporalType.DATE)
	@Column(name="PAYMENT_DATE")
	private Date paymentDate;

    @Column(name="remark")
	private String remark;

	//bi-directional many-to-one association to SobLoan
    @ManyToOne
	@JoinColumn(name="LOAN_ID")
	private SobLoan sobLoan;

    public SobLoanPayment() {
    }

	public BigDecimal getCapitalpaid() {
		return this.capitalpaid;
	}

	public void setCapitalpaid(BigDecimal capitalpaid) {
		this.capitalpaid = capitalpaid;
	}

	public BigDecimal getInterestpaid() {
		return this.interestpaid;
	}

	public void setInterestpaid(BigDecimal interestpaid) {
		this.interestpaid = interestpaid;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public SobLoan getSobLoan() {
		return this.sobLoan;
	}

	public void setSobLoan(SobLoan sobLoan) {
		this.sobLoan = sobLoan;
	}

	public Long getLoanpayid() {
		return loanpayid;
	}

	public void setLoanpayid(Long loanpayid) {
		this.loanpayid = loanpayid;
	}
	
}