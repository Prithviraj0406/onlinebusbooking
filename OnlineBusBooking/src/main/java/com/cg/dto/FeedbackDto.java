package com.cg.dto;

public class FeedbackDto {
	
	private int ratings;
	private String comments;
	private String username;
	private String routeName;
	private Integer userId;
	private Integer busoperator;
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
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBusoperator() {
		return busoperator;
	}
	public void setBusoperator(Integer busoperator) {
		this.busoperator = busoperator;
	}
	public FeedbackDto(int ratings, String comments, String username, String routeName, Integer userId,
			Integer busoperator) {
		super();
		this.ratings = ratings;
		this.comments = comments;
		this.username = username;
		this.routeName = routeName;
		this.userId = userId;
		this.busoperator = busoperator;
	}
	public FeedbackDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
