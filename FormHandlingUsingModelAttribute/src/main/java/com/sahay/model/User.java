package com.sahay.model;

public class User {
	private String name;
	private int age;	
	private String country;
	private String email;

	public User(String name, int age, String country,String email) {
		super();
		this.name = name;
		this.age = age;		
		this.country = country;
		this.email=email;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public String getEmail() {
		return email;
	}

	
	

}
