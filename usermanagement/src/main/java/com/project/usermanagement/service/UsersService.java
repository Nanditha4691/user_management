package com.project.usermanagement.service;

import java.util.List;

import com.project.usermanagement.dto.UsersRequestDto;
import com.project.usermanagement.dto.UsersResponseDto;
import com.project.usermanagement.entity.Users;

public interface UsersService {
	
	String register(UsersRequestDto user);
	UsersResponseDto searchUser(Long id);
	List<UsersResponseDto> viewAllUsers();
	String updateUser(Users user);
	String deleteUser(Long id);
}
