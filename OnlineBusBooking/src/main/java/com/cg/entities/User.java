package com.cg.entities;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class User {

	@Id
	private int userId;
	private String username;
	private String password;
	//@OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
	//@Transient
	//private Map<Booking, FeedBack> bookingFeedbackInfo;
	//private List<Booking> booking;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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

	
	
}
