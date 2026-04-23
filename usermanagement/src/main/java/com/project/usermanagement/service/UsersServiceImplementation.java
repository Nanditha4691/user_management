package com.project.usermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.usermanagement.dto.UsersRequestDto;
import com.project.usermanagement.dto.UsersResponseDto;
import com.project.usermanagement.entity.Users;
import com.project.usermanagement.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService{
	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String register(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersResponseDto> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(UsersRequestDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(UsersRequestDto user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
