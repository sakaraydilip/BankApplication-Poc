package com.xoriant.assignment3;

import java.time.LocalDateTime;

public class User {
	private String name;
	private LocalDateTime createdDate;
	private LocalDateTime expiryDate;
	
	public User() {
		super();
	}
	
	public User(String name, LocalDateTime createdDate, LocalDateTime expiryDate) {
		super();
		this.name = name;
		this.createdDate = createdDate;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

}
