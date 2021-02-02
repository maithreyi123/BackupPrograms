package com.exampleRegisterDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegisterDemo.domain.Register;
import com.example.RegisterDemo.service.RegisterDemoService;

@RestController
@RequestMapping("api/v1")
public class RegisterDemoController {

	@Autowired
	private RegisterDemoService registerservice;

	public RegisterDemoController(RegisterDemoService registerservice) {
		this.registerservice = registerservice;

	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public Register savedetails(@RequestBody Register input) {
		Register response = registerservice.savedetails(input);
		return response;

	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<Register> getdetails() {

		List<Register> res = registerservice.getdetails();
		return res;

	}

}
