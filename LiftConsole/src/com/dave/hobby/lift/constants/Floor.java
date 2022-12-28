package com.dave.hobby.lift.constants;

/**
 * 
 * @author David
 * Dec 27, 2022
 * 
 * Enlist all floors so that they are referenced from a single source
 * 
 */
public enum Floor {
	BP ("Basement Parking"),
	GF ("Ground Floor (Floor Zero)"),
	L1 ("Floor 1"),
	L2 ("Floor 2"),
	L3 ("Floor 3"),
	L4 ("Floor 4"),
	L5 ("Floor 5"),
	L6 ("Floor 6"),
	L7 ("Floor 7"),
	L8 ("Floor 8"),
	L9 ("Floor 9"),
	L10 ("Floor 10");
	
	private final String floor;
	
	Floor(String floor) {
		this.floor = floor;
	}

	public String getStatus() {
		return floor;
	}
}
