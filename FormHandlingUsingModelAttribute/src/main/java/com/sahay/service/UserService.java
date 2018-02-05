package com.sahay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahay.dao.UserDao;
import com.sahay.model.User;

@Service
public class UserService {
		
	@Autowired
   private UserDao dao;
	public void add(User user) {
		dao.addOneUser(user);
		
	}
	public List<User> getAllUser() {
		
		return dao.getUsers();
	}

}
