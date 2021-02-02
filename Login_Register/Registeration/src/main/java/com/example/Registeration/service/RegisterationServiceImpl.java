package com.example.Registeration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Registeration.Repository.RegisterationRepo;
import com.example.Registeration.domain.Register;

@Service
public class RegisterationServiceImpl implements RegisterationService {

	private RegisterationRepo repo;

	@Autowired
	public RegisterationServiceImpl(RegisterationRepo repo) {
		this.repo = repo;

	}

	@Override
	public Register savedetails(Register input) {

		Register res = repo.save(input);
		return res;
	}

	@Override
	public List<Register> getdetails() {
		List<Register> respo = (List<Register>) repo.findAll();

		return respo;

	}

}
