package com.dave.hobby.lift.model;

import java.util.List;

import com.dave.hobby.lift.constants.DoorStatus;
import com.dave.hobby.lift.constants.Floor;
import com.dave.hobby.lift.constants.LiftStatus;

/**
 * 
 * @author David
 *	Dec 27, 2022
 */
public class Lift {
	private final String label;
	private final String description;
	private Floor currentFloor;
	private DoorStatus doorStatus;
	private List<Destination> destinations;
	private LiftStatus status;
	
	public Lift(String label, String description) {
		this.label = label;
		this.description = description;
	}

	public Floor getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(Floor currentFloor) {
		this.currentFloor = currentFloor;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}

	public void setDoorStatus(DoorStatus doorStatus) {
		this.doorStatus = doorStatus;
	}

	public List<Destination> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	public String getLabel() {
		return label;
	}

	public String getDescription() {
		return description;
	}
	
	public LiftStatus getStatus() {
		return status;
	}

	public void setStatus(LiftStatus status) {
		this.status = status;
	}

	/**
	 * Important Methods
	 * 
	 */
	public void pickUser(String currentFloor) {
		//Implement
		
	}
	
	public void dropUser() {
		//Implement
		
	}
	
	public void openDoor() {
		//Implement
		
	}
	
	public void closeDoor() {
		//Implement
	}
	
	public void resetToFloor() {
		
	}
	
	public void travelToFloor(Floor floor) {
		
	}
	
	@Override
	public String toString() {
		return "Lift [label=" + label + ", description=" + description + ", currentFloor=" + currentFloor
				+ ", doorStatus=" + doorStatus + ", destinations=" + destinations + "]";
	}
	
}
