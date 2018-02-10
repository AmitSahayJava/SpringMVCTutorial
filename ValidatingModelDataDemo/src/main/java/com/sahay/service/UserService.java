package com.sahay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahay.model.User;
import com.sahay.repository.UserRepository;

@Service
public class UserService {
	@Autowired
   private UserRepository userRepository;

	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	public List getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.getUserList();
	}
}
