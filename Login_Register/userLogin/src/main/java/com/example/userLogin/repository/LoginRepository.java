package com.example.userLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userLogin.domain.UserLogin;

public interface LoginRepository extends JpaRepository<UserLogin, String>{

	UserLogin findByEmailId(String emailId);



}
