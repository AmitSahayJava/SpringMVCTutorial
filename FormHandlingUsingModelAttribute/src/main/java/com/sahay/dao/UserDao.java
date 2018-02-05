package com.sahay.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sahay.model.User;

@Repository
public class UserDao {	
	
	private static List<User> list=null;
	   
	   static{
		   list=new ArrayList<User>();
		   list.add(new User("Amit Kumar", 30, "India","a.sahayji@hmail.com"));
		   list.add(new User("Sumit Kumar", 27,"US","sumitmba2012@gmail.com"));
		   list.add(new User("Brock Lesner", 40, "US","b.rock@yahoo.com"));
	   }

	public void addOneUser(User user) {
		list.add(user);		
		
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return list;
	}

}
