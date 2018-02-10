package com.sahay.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sahay.model.User;

@Repository
public class UserRepository {
	private static List<User> list=null;
	static{
		list=new ArrayList<User>();
	}

	public void save(User user) {
		list.add(user);
		
	}

	public List getUserList() {
		// TODO Auto-generated method stub
		return list;
	}

}
