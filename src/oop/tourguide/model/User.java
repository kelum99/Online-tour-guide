package oop.tourguide.model;

public class User {

	String FirstName;
	String LastName;
	String UserName;
	String Address;
	String Mobile;
	String Email;
	String Password;
	
	public User() {}
	
	
	public User(String firstName, String lastName, String userName, String address, String mobile, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		UserName = userName;
		Address = address;
		Mobile = mobile;
		Email = email;
	}




	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getMobile() {
		return Mobile;
	}
	
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
}
