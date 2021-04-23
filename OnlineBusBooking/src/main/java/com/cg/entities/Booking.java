package com.cg.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	private long bookingId; // busoperatorid+busid+date+time+uniqueNumber
	private String username; // login-username
	//private List<Pessenger> pessengersInfo;
	private String busNumber;
	private String source;
	private String destination;
	private int numberOfSeats;
	private int amountPaid;
	private LocalDate bookingdate;
	private LocalTime journeyStartTime;
	private LocalTime journeyEndTime;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(long bookingId, String username, String busNumber, String source, String destination,
			int numberOfSeats, int amountPaid, LocalDate bookingdate, LocalTime journeyStartTime,
			LocalTime journeyEndTime) {
		super();
		this.bookingId = bookingId;
		this.username = username;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.amountPaid = amountPaid;
		this.bookingdate = bookingdate;
		this.journeyStartTime = journeyStartTime;
		this.journeyEndTime = journeyEndTime;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public LocalDate getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(LocalDate bookingdate) {
		this.bookingdate = bookingdate;
	}
	public LocalTime getJourneyStartTime() {
		return journeyStartTime;
	}
	public void setJourneyStartTime(LocalTime journeyStartTime) {
		this.journeyStartTime = journeyStartTime;
	}
	public LocalTime getJourneyEndTime() {
		return journeyEndTime;
	}
	public void setJourneyEndTime(LocalTime journeyEndTime) {
		this.journeyEndTime = journeyEndTime;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", username=" + username + ", busNumber=" + busNumber + ", source="
				+ source + ", destination=" + destination + ", numberOfSeats=" + numberOfSeats + ", amountPaid="
				+ amountPaid + ", bookingdate=" + bookingdate + ", journeyStartTime=" + journeyStartTime
				+ ", journeyEndTime=" + journeyEndTime + "]";
	}
	
}
