package com.sahay.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sahay.model.User;

@Repository
public class UserRepository {
	/*Repository uses Model class*/
    private static List<User> list=null;
    static{
    	list=new ArrayList<User>();
    }
    
    public void saveUser(User user){
    	list.add(user);
    }
    
    public List<User> viewAllUser(){
    	return list;
    }
}
