package com.dave.hobby.lift;

import java.util.Date;

import com.dave.hobby.lift.constants.Floor;
import com.dave.hobby.lift.constants.LiftStatus;
import com.dave.hobby.lift.model.Lift;

public class LiftManager implements Runnable {

	private final Lift lift;
	
	public LiftManager(Lift lift) {
		this.lift = lift;
	}
	
	public Lift getLift() {
		return lift;
	}

	@Override
	public void run() {
		System.out.println("[" + new Date(System.currentTimeMillis()) + "]: Lift " + lift.getLabel() + " started operation.");
		
		lift.travelToFloor(Floor.GF);	//Make the Lift travel to the ground floor
		lift.setCurrentFloor(Floor.GF);	//Omit this ASAP since the travelToFloor() will eventually set its current floor to GF
		lift.setStatus(LiftStatus.STOPPED);	//Omit this since it will be set by travelToFloor() method, only used here for demo
	}

	public void travelToFloor(Floor floor) {
		lift.travelToFloor(floor);
		
	}

	public void setCurrentFloor(Floor floor) {
		lift.setCurrentFloor(floor);
	}

	public void setStatus(LiftStatus status) {
		lift.setStatus(status);
	}

	public LiftStatus getStatus() {
		return lift.getStatus();
	}

	public String getLabel() {
		lift.getLabel();
		return null;
	}
}
