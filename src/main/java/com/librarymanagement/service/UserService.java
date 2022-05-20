package com.librarymanagement.service;

import java.util.List;

import com.librarymanagement.model.User;

public interface UserService {

	User addUser(User user);
	
	List<User> getAllUsers();
}
