package com.sahay.model;

import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/*
 * @size
 * @past
 * @Email
 * @Min @Max are working but others are not working
 */

public class User {
	@Size(min=2,max=30,message="Name must be between 2 and 30 character")
	private String userName;
	
	@Past(message="Date of Birth Should be in past")
	private Date userDOB;
	@Size(min=2,max=8, message="Enter Atleast 2 Skills")
	private String[] userSkills;
	
	private String userAddress;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}
	public String[] getUserSkills() {
		return userSkills;
	}
	public void setUserSkills(String[] userSkills) {
		this.userSkills = userSkills;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
		
}
