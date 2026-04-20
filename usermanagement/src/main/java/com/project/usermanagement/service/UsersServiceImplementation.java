package com.project.usermanagement.service;

import org.springframework.stereotype.Service;

import com.project.usermanagement.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService{

	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}
	
	
}
