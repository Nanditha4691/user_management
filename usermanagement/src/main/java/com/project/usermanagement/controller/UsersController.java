package com.project.usermanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.usermanagement.dto.UsersRequestDto;
import com.project.usermanagement.dto.UsersResponseDto;
import com.project.usermanagement.entity.Users;
import com.project.usermanagement.service.UsersService;

@RestController
public class UsersController {
	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/register")
	public String register(UsersRequestDto user) {
		return service.register(user);
	}
	@GetMapping("/searchuser/{id}")
	public UsersResponseDto searchUser(Long id) {
		return service.searchUser(id);
	}
	@GetMapping("/viewAllUsers")
	public List<UsersResponseDto> viewAllUsers() {
		return service.viewAllUsers()
;	}
	@PutMapping("/updateUsers")
	public String updateUser(Users user) {
		return service.updateUser(user);
	}
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(Long id) {
		return service.deleteUser(id);
	}
}
