package com.example.tp5daaw.Model;

public class User {
	
	private String firstname;
	private String lastname;
	private String adress;
	private String phone;
	private String username;
	private String password;
	private int ID;
	public User() {
		
	}
	public User(String firstname, String lastname, String adress, String phone, String username, String password, int ID) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.ID=ID;

	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getid() {
		return ID;
	}
	public void setid(int Id) {
		this.ID= ID;
	}

	

}
