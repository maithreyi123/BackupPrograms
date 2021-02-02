package com.example.userLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userLogin.domain.UserLogin;
import com.example.userLogin.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepo;

	public LoginServiceImpl(LoginRepository loginRepo) {

		this.loginRepo = loginRepo;

	}
	
	
	public UserLogin save(Registration userProfile) {
		UserLogin user = new UserLogin();
		user.setUserEmail(userProfile.getUserEmail());
		user.setUserPassword(userProfile.getUserPassword());
		return loginRepo.save(user);
	}
	
	
	
	
	
	
	

	//@Override
	public UserLogin findByEmail(String EmailId) {

		return loginRepo.findByEmailId(EmailId);

	}

}
