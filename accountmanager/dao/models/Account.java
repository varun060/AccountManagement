// package for handling all dao based models for ORM
package com.bank.account.accountmanager.dao.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class to map Account table to object
 * ORM will be achieved through this table
 * @author varun
 *
 */
/**
 * @author varun
 *
 */
@Entity
@Table(name = "accounts")
public class Account {
	
	//declare primary key variable
	@Id
	private int accId;
	
	/**
	 * Declare all column variables
	 * and corresponding getters and setters
	 */
	@Column(name="acc_name")
	private String accName;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Date getBalancOeDate() {
		return balancOeDate;
	}
	public void setBalancOeDate(Date balancOeDate) {
		this.balancOeDate = balancOeDate;
	}
	public String getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Column(name="acc_type")
	private String accType;
	@Column(name="bal_date")
	private Date balancOeDate;
	@Column(name="currency_type")
	private String currencyType;
	@Column(name="available_balance")
	private int balance;
	
	
	
	

}
