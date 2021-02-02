package com.example.userLogin.service;

import com.example.userLogin.domain.UserLogin;

public interface LoginService {
	
	
	UserLogin findByEmail(String EmailId);
	}


