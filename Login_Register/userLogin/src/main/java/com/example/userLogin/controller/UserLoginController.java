package com.example.userLogin.controller;

import java.util.Date;

import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.userLogin.domain.Token;
import com.example.userLogin.domain.UserLogin;
import com.example.userLogin.exception.UserIdOrPasswordMissMatchException;
import com.example.userLogin.exception.UserIdOrPasswordNotFound;
import com.example.userLogin.exception.UserNotFoundException;
import com.example.userLogin.service.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class UserLoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> loginUser(@RequestBody UserLogin login) throws ServletException {

		String jwtToken = "";

		try {
			if (login.getEmailId() == null || login.getPassword() == null) {

				throw new UserIdOrPasswordMissMatchException("Fill details");

				// throw new UserNameOrPasswordEmptyException("Please fill in username and
				// password");
			}
		} catch (UserIdOrPasswordMissMatchException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.CONFLICT);
		}

		String email = login.getEmailId();
		String password = login.getPassword();
		UserLogin user = loginService.findByEmail(email);

		try {
			if (user == null) {
				throw new UserIdOrPasswordNotFound("User email not found.");
			}
		} catch (UserIdOrPasswordNotFound e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.CONFLICT);
		}

		String pwd = user.getPassword();

		try {
			if (!password.equals(pwd)) {
				throw new UserNotFoundException("Invalid login. Please check your name and password.");
			}
		} catch (UserNotFoundException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.CONFLICT);
		}

		/* generating the jwt token */

		jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		Token token = new Token();
		token.setEmail(email);
		token.setToken(jwtToken);
		return new ResponseEntity<>(token, HttpStatus.CREATED);

	}
}
