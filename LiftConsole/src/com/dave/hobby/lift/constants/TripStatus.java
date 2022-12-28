package com.dave.hobby.lift.constants;

/**
 * 
 * @author David
 *	Dec 27, 2022
 */
public enum TripStatus {
	
	WAITING ("Waiting for Lift"),
	BOARDED ("Boarded and Travelling"),
	ARRIVED ("Passenger(s) has arrived and leaving"),
	CANCELLED ("Trip cancelled by Passenger");

	private final String status;
	
	private TripStatus(String status) {
		this.status = status; 
	}
	
	public String getTripStatus() {
		return status;
	}
	
}
