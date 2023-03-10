package com.dave.hobby.lift;

import java.util.ArrayList;
import java.util.List;

import com.dave.hobby.lift.constants.Floor;
import com.dave.hobby.lift.constants.LiftStatus;
import com.dave.hobby.lift.model.Lift;

public class LiftController {
	
	private static final List<Lift> lifts = new ArrayList<>();
	
	private static Lift liftA = new Lift("A", "Operating first left)");
	private static Lift liftB = new Lift("B", "Operating second left)");
	private static Lift liftC = new Lift("C", "Operating second right)");
	private static Lift liftD = new Lift("D", "Operating first right)");
	
	public static void main(String[] args) {
		lifts.add(liftA);
		lifts.add(liftB);
		lifts.add(liftC);
		lifts.add(liftD);
		
		//set them to the Ground floor
		for(Lift f : lifts) {
			f.travelToFloor(Floor.GF);	//Make the Lift travel to the ground floor
			f.setCurrentFloor(Floor.GF);	//Omit this ASAP since the travelToFloor() will eventually set its current floor to GF
			f.setStatus(LiftStatus.STOPPED);	//Omit this since it will be set by travelToFloor() method, only used here for demo
			
		}
		
		System.out.println("*******************************************");
		System.out.println("*  Welcome to Dave's Lift Control Center  *");
		System.out.println("*******************************************");
		
		runLiftChecks();
	}
	
	public static void runLiftChecks() {
		for(Lift f : lifts) {
			//If this lift is not marked as failed, then indicate as healthy 
			if(f.getStatus() == LiftStatus.IN_MOTION || f.getStatus() == LiftStatus.STOPPED) {
				System.out.println("Lift " + f.getLabel() + " is ****OKAY****");
			}
		}
	}
	
}
