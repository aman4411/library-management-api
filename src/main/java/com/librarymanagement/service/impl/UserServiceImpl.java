package com.librarymanagement.service.impl;

import org.springframework.stereotype.Service;

import com.librarymanagement.model.User;
import com.librarymanagement.repository.UserRepository;
import com.librarymanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

}
