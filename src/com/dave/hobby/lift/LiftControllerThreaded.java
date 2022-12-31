package com.dave.hobby.lift;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.dave.hobby.lift.constants.Floor;
import com.dave.hobby.lift.constants.LiftStatus;
import com.dave.hobby.lift.model.Lift;

public class LiftControllerThreaded {
	
	private static final List<LiftManager> lifts = new ArrayList<>();
	
	private static Lift liftA = new Lift("A", "Operating first left)");
	private static Lift liftB = new Lift("B", "Operating second left)");
	private static Lift liftC = new Lift("C", "Operating second right)");
	private static Lift liftD = new Lift("D", "Operating first right)");
	
	static LiftManager mannA = new LiftManager(liftA);
	static LiftManager mannB = new LiftManager(liftB);
	static LiftManager mannC = new LiftManager(liftC);
	static LiftManager mannD = new LiftManager(liftD);
	
	static List<Thread> threadList = new ArrayList<Thread>();
	static boolean running = true;
	
	static Floor myFloor = Floor.L1;
	
	public static void main(String[] args) {
		System.out.println("*******************************************");
		System.out.println("|  Welcome to Dave's Lift Control Center  |");
		System.out.println("*******************************************");
		
		lifts.add(mannA);
		lifts.add(mannB);
		lifts.add(mannC);
		lifts.add(mannD);
		
		runLiftChecks();
		
		//set them to the Ground floor
		for(LiftManager r : lifts) {
			Thread liftThread = new Thread(r);
			threadList.add(liftThread);
		}
		
		System.out.println("About to start Lift Operations: " + threadList.size() + " Lifts are starting");
		for(Thread th : threadList) {
			th.start();
		}
		
		Scanner sc = new Scanner(System.in);

		String command = "";
		while(running) {
			showMenu();
			System.out.print("Choose option from menu: ");
			command = sc.nextLine();
			System.out.println();
			
			switch(command) {
			case "1":
				Floor[] indexes = Floor.values();
				
				System.out.print("Choose floor to go to [ " );
				int index = 0;
				for(Floor f : indexes) {
					System.out.print(f);
					if(index != (indexes.length - 1)) {
						System.out.print(", ");
					}
					index ++;
				}
				System.out.print("]: ");
				String goFloor = sc.nextLine();
				goFloor = goFloor.toUpperCase();
				
				System.out.println();
				
				System.out.println("You are going to " + Floor.valueOf(goFloor) + " - " + Floor.valueOf(goFloor).getFloorDescription());
				
				//Arbitrary
				int randomLift = random(3);
				
				Lift lif = lifts.get(randomLift).getLift();
				
				System.out.println("Lift " + lif.getLabel() + " is coming to pick you. " + lif.getDescription());
				
				lif.pickUser(myFloor);
				lif.travelToFloor(Floor.valueOf(goFloor));
				break;
				
			case "000":
				shutDownLifts();
			}
		}
		
		sc.close();
	}
	
	public static int random(int limit) {
		Random random = new Random();
		
		int num = random.nextInt(limit);
		
		return (num+1);
	}
	
	private static void showMenu() {
		System.out.println();
		System.out.println("1. Board Lift");
		System.out.println("2. View All Destinations");
	}

	private static void shutDownLifts() {
		System.out.println("Shutting down all lifts");
		for(Thread th : threadList) {
			th.stop();
		}
		running = false;
	}

	public static void runLiftChecks() {
		System.out.println("Running lift checks to ensure safety for use...");
		for(LiftManager f : lifts) {
			//If this lift is not marked as failed, then indicate as healthy 
			if(f.getStatus() == LiftStatus.IN_MOTION || f.getStatus() == LiftStatus.STOPPED) {
				System.out.println("Lift " + f.getLabel() + " is ****OKAY****");
			}
		}
		
		System.out.println();
	}
	
}
