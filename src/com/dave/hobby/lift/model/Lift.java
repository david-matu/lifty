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
		this.setCurrentFloor(Floor.BP);
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
	public void pickUser(Floor userFloor) {
			travelToFloor(userFloor);
			openDoor();
			
	}
	
	public void dropUser() {
		System.out.println("Opening Door");
		
	}
	
	public void openDoor() {
		System.out.println(label + ": Opening Door for ");
		
		
	}
	
	public void closeDoor() {
		System.out.println(label + ": Closing Door");
	}
	
	public void resetToFloor() {
		
	}
	
	public void travelToFloor(Floor floor) {
		System.out.println("[" + label + "]: I am travelling from " + this.getCurrentFloor() + " to " + floor);
		//Get the index whether positive or negative
		Floor[] indexes = Floor.values();
		
		int currentIndex = 0;
		
		int fNo = 0;
		for(Floor f : indexes) {
			//System.out.print(f + " ");
			if(f.equals(floor)) {
				currentIndex = fNo;
			}
			fNo++;
		}
		
		System.out.println("Current index: " + currentIndex);
		currentFloor = floor;
		//System.out.println(label + " currently on floor index " + Floor.valueOf(Floor(floor)));
	}
	
	private String Floor(Floor floor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Lift [label=" + label + ", description=" + description + ", currentFloor=" + currentFloor
				+ ", doorStatus=" + doorStatus + ", destinations=" + destinations + "]";
	}
	
}
