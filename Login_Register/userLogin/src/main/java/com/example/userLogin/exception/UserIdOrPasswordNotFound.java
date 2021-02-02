package com.example.userLogin.exception;

public class UserIdOrPasswordNotFound extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	
	public UserIdOrPasswordNotFound(){
		
	}
	
	
	public UserIdOrPasswordNotFound(String message) {
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
		return "UserIdOrPasswordNotFound [message=" + message + "]";
	}

}
