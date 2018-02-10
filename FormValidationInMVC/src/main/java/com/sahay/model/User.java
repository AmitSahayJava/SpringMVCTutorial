package com.sahay.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {
	@Size(min=2,max=30,message="Name must be between 2 and 30 character")
	private String name;
	@Email(message="Enter Valid Email ID")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
