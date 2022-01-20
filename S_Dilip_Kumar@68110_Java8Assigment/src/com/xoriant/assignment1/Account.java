package com.xoriant.assignment1;

import java.time.LocalDate;

public class Account 
{

	private String firstName;
	private String lastName;
	
	private int accountNumber;
	private LocalDate dateOpened;
	private boolean isActive;
	private double balance;
	private String gender;
	
	public Account() {
		super();
	}
	
	public Account(String firstName, String lastName, int accountNumber, LocalDate dateOpened, boolean isActive,
			double balance, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.dateOpened = dateOpened;
		this.isActive = isActive;
		this.balance = balance;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDate getDateOpened() {
		return dateOpened;
	}
	public void setDateOpened(LocalDate dateOpened) {
		this.dateOpened = dateOpened;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", dateOpened=" + dateOpened + ", isActive=" + isActive + ", balance=" + balance + ", gender="
				+ gender + "]";
	}
	
	
}
