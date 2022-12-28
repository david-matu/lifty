package com.dave.hobby.lift.constants;

/**
 * 
 * @author David
 *	Dec 27, 2022
 */
public enum LiftStatus {
	IN_MOTION ("Lift is Travalling"),
	STOPPED ("Lift has stopped at Checkpoint"),
	FAILED ("Lift is in Failed State. Evacuation should be done by Rescue Team, if the lift has passengers");
	
	private final String status;
	
	LiftStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
