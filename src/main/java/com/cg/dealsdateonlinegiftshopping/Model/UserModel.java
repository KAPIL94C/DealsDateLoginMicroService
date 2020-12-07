package com.cg.dealsdateonlinegiftshopping.Model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cg.dealsdateonlinegiftshopping.entity.User.login;
import com.cg.dealsdateonlinegiftshopping.entity.User.type;

public class UserModel {
	

	private int userId;
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	private String confirmPassword;
	private String phoneNumber;

	public enum type {
		admin, user
	};

	@Enumerated(EnumType.STRING)
	private type userType=type.user;

	public enum login {
		LoggedIn, LoggedOut
	};

	@Enumerated(EnumType.STRING)
	private login loginStatus=login.LoggedOut;

	
	public UserModel(String email, String firstname, String lastname, String password, String confirmPassword,
			String phoneNumber) {
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
		
		
	}

	public UserModel() {
		super();
	}

	
	public UserModel(int userId, String email, String firstname, String lastname, String password, String confirmPassword,
			String phoneNumber) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public type getUserType() {
		return userType;
	}

	public void setUserType(type userType) {
		this.userType = userType;
	}

	public login getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(login loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	

}
