package com.project.usermanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.usermanagement.service.UsersService;

@RestController
public class UsersController {
	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
	
	

}
