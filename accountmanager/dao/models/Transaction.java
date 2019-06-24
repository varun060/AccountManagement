package com.bank.account.accountmanager.dao.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Class to map Transaction table to object
 * ORM will be achieved through this table
 * @author varuns
 *
 */
@Entity
@Table(name = "transactions")
public class Transaction {
	
	
	
	/**
	 * Declare all column variables
	 */
	@Id
    @GeneratedValue
    private int id;
	/*
	 * @Column(name="acc_id") private int accId;
	 */
	@Column(name="transaction_amount")
	private String transactionAmount;
	@Column(name="transaction_date")
	private Date trancationDate;
	@Column(name="transaction_type")
	private String transactionType;
	
	@Column(name="acc_id")
	private int accId;


	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTrancationDate() {
		return trancationDate;
	}

	public void setTrancationDate(Date trancationDate) {
		this.trancationDate = trancationDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}

	
	@Column(name="transaction_narrative")
	private String transactionNarrative;
	
	// get account details related to transaction
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "acc_id",insertable=false, updatable=false)	
	@OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
	private Account account;
	
	

}
