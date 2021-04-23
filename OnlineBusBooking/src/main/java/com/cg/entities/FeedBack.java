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
	private int feedbackId;
	private int ratings;
	private String comments;
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
	public FeedBack(int feedbackId, int ratings, String comments, String username, String routeName, User user,
			BusOperator busoperator) {
		super();
		this.feedbackId = feedbackId;
		this.ratings = ratings;
		this.comments = comments;
		this.username = username;
		this.routeName = routeName;
		this.user = user;
		this.busoperator = busoperator;
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
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
	@Override
	public String toString() {
		return "FeedBack [feedbackId=" + feedbackId + ", ratings=" + ratings + ", comments=" + comments + ", username="
				+ username + ", routeName=" + routeName + ", user=" + user + ", busoperator=" + busoperator + "]";
	}
	
	
}
