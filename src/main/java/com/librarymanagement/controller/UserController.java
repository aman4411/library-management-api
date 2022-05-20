package com.librarymanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.model.User;
import com.librarymanagement.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	//create user
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createdUser = userService.addUser(user);
		return new ResponseEntity<User>(createdUser,HttpStatus.CREATED);
	}
	
}
