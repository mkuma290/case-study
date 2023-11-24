package com.user.user_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class User {
	
	
	
	private Long userId;
	private String userName;
	
	public User(long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
	public User() {
		super();
	}


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
