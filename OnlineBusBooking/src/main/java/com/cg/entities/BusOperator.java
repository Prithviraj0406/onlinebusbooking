package com.cg.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusOperator {
	@Id
	private int busOperatorId;
	private String busOperatorUsername;
	private String passowrd;
	//private List<Bus> operationalBuses;
	 @Column
     @ElementCollection(targetClass=Integer.class)
	private List<Integer> caseNumber; // Inorder to cancel bus or update bus route or fare
	public BusOperator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusOperator(int busOperatorId, String busOperatorUsername, String passowrd, List<Integer> caseNumber) {
		super();
		this.busOperatorId = busOperatorId;
		this.busOperatorUsername = busOperatorUsername;
		this.passowrd = passowrd;
		this.caseNumber = caseNumber;
	}
	public int getBusOperatorId() {
		return busOperatorId;
	}
	public void setBusOperatorId(int busOperatorId) {
		this.busOperatorId = busOperatorId;
	}
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}
	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	public List<Integer> getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(List<Integer> caseNumber) {
		this.caseNumber = caseNumber;
	}
	
	
}
