package com.suraj.model;


public class AccountInput {

	private long accountId;
	private double amount;
	
	public AccountInput(long accountId, double amount) {
		super();
		this.accountId = accountId;
		this.amount = amount;
	}
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
