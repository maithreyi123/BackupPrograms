package com.example.Registeration.service;

import java.util.List;

import com.example.Registeration.domain.Register;

public interface RegisterationService {

	public Register savedetails(Register input);

	public List<Register> getdetails();

}
