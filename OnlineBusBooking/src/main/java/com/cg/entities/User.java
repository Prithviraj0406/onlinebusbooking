package com.cg.entities;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user1")
public class User {

	@Id
	private int userId;
	private String username;
	private String password;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	@MapKeyColumn(name="Booking_feedback",nullable=true)
	private Map<Booking, FeedBack> bookingFeedbackInfo;
	//private List<Booking> booking;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String username, String password, Map<Booking, FeedBack> bookingFeedbackInfo) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.bookingFeedbackInfo = bookingFeedbackInfo;
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
	public Map<Booking, FeedBack> getBookingFeedbackInfo() {
		return bookingFeedbackInfo;
	}
	public void setBookingFeedbackInfo(Map<Booking, FeedBack> bookingFeedbackInfo) {
		this.bookingFeedbackInfo = bookingFeedbackInfo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", bookingFeedbackInfo="
				+ bookingFeedbackInfo + "]";
	}
	
}
