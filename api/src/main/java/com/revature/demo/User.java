package com.revature.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userID;
	
	@Column(name = "user_name")
	private String user;
	
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", user=" + user + "]";
	}


	
}