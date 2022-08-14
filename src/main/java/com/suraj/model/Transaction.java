package com.suraj.model;

import java.time.LocalDateTime;

public class Transaction {

	private long id;
	private long sourceAccountId;
	private String sourceOwnerName;
	private long targetAccountId;
	private String targetOwnerName;
	private double amount;
	private LocalDateTime initiationDate;
	private String reference;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSourceAccountId() {
		return sourceAccountId;
	}
	public void setSourceAccountId(long sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}
	public String getSourceOwnerName() {
		return sourceOwnerName;
	}
	public void setSourceOwnerName(String sourceOwnerName) {
		this.sourceOwnerName = sourceOwnerName;
	}
	public long getTargetAccountId() {
		return targetAccountId;
	}
	public void setTargetAccountId(long targetAccountId) {
		this.targetAccountId = targetAccountId;
	}
	public String getTargetOwnerName() {
		return targetOwnerName;
	}
	public void setTargetOwnerName(String targetOwnerName) {
		this.targetOwnerName = targetOwnerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDateTime getInitiationDate() {
		return initiationDate;
	}
	public void setInitiationDate(LocalDateTime initiationDate) {
		this.initiationDate = initiationDate;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
}
