package com.example.RegisterDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RegisterDemo.domain.Register;
import com.example.RegisterDemo.repository.RegisterRepository;

@Service
public class RegisterDemoServiceImpl implements RegisterDemoService {

	@Autowired
	private RegisterRepository repo;

	public RegisterDemoServiceImpl(RegisterRepository repo) {
		this.repo = repo;
	}

	@Override
	public Register savedetails(Register input) {

		Register response = repo.save(input);
		return response;

	}

	@Override
	public List<Register> getdetails() {
		List<Register> resp = (List<Register>) repo.findAll();
		return resp;
	}

}
