package com.dave.hobby.lift.model;

import java.sql.Timestamp;

import com.dave.hobby.lift.constants.TripStatus;

/**
 * 
 * @author David
 *	Dec 27, 2022
 */
public class Destination {
	
	private final int tripNumber;
	private final String departure;	//The floor number where User will depart from
	private final String destination;	//The destination floor for this User
	private final Timestamp requestTime;
	private final Timestamp boardTime;
	private Timestamp arrivalTime;
	private TripStatus tripStatus;	//Not final since it can be cancelled by User
	
	/**
	 * Args-constructor
	 *  
	 * @param tripNumber
	 * @param departure
	 * @param destination
	 * @param requestTime
	 * @param boardTime
	 */
	public Destination(int tripNumber, String departure, String destination, Timestamp requestTime, Timestamp boardTime) {
		this.tripNumber = tripNumber;
		this.departure = departure;
		this.destination = destination;
		this.requestTime = requestTime;
		this.boardTime = boardTime;
	}

	public Timestamp getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public TripStatus getTripStatus() {
		return tripStatus;
	}

	public void setTripStatus(TripStatus tripStatus) {
		this.tripStatus = tripStatus;
	}

	public int getTripNumber() {
		return tripNumber;
	}

	public String getDeparture() {
		return departure;
	}

	public String getDestination() {
		return destination;
	}

	public Timestamp getRequestTime() {
		return requestTime;
	}

	public Timestamp getBoardTime() {
		return boardTime;
	}
	
	
	
}
