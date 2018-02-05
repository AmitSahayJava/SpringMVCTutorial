package com.sahay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahay.model.User;
import com.sahay.repository.UserRepository;

@Service
public class UserService {
   /*
    * Service Depends on Repository
    */
	@Autowired
	private UserRepository userRepository;
	
	public void save(User user){
		userRepository.saveUser(user);
	}
	
	public List<User> viewAll(){
		return userRepository.viewAllUser();
	}
}
