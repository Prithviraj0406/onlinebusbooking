package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback1")
public class FeedBack {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rating;
	private String comment;
	private String username;
	private String routeName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private User user;
	@OneToOne(cascade=CascadeType.ALL)
	private BusOperator busoperator;
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedBack(int rating, String comment, String username, String routeName, User user, BusOperator busoperator) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.username = username;
		this.routeName = routeName;
		this.user = user;
		this.busoperator = busoperator;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BusOperator getBusoperator() {
		return busoperator;
	}
	public void setBusoperator(BusOperator busoperator) {
		this.busoperator = busoperator;
	}
	
	
}
