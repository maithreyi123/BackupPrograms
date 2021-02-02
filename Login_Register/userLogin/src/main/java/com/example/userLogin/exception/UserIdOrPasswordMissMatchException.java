package com.example.userLogin.exception;

public class UserIdOrPasswordMissMatchException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public UserIdOrPasswordMissMatchException(){
	
	}
	
	
	
	public UserIdOrPasswordMissMatchException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserIdOrPasswordMissMatchException [message=" + message + "]";
	}

}
