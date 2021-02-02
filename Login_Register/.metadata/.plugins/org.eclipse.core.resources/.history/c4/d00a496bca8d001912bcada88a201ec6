package com.example.userLogin.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class UserLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private String userId;
	private String EmailId;
	private String password;

	@CreationTimestamp
	private Date created;

	public UserLogin() {
		super();

	}

	public UserLogin(String userId, String emailId, String password, Date created) {
		super();
		this.userId = userId;
		EmailId = emailId;
		this.password = password;
		this.created = created;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
