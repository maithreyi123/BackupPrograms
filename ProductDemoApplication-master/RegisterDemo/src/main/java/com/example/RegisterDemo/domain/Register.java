package com.example.RegisterDemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Register {

	@Id
	private int userId;
	private String name;

	public Register() {
		super();

	}

	public Register(int userId, String name) {
		super();
		this.userId = userId;
	//	this.password = password;
		this.name = name;

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getname() {
		return name;
	}

	public void setPassword(String name) {
		this.name = name;
	}

}
