package com.baasjam.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baasjam.platform.web.response.BJResponse;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BJController{
	
	/***
	 * User's login
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<BJResponse> login(){
		return ok();
	}
	
}
