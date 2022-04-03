package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;

public class JetsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApplication jetsApp = new JetsApplication();
		Airfield airfield = new Airfield();

		jetsApp.run(airfield);

	}

	public void run(Airfield airfield) {
		airfield.loadJets();
		displayMenu(airfield);
	}

	public void displayMenu(Airfield airfield) {
		boolean keepGoing = true;
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the airfield! What would you like to do?\n");
		while (keepGoing) {
			int choice = 0;
			System.out.println("------------------------------");
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all cargo jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add jet to fleet");
			System.out.println("8. Remove a jet from fleet");
			System.out.println("9. Quit");
			System.out.println("------------------------------");
			System.out.println("\nChoice > ");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				airfield.flyAllJets();
				break;
			case 3:
				System.out.println( airfield.getFastest());
				break;
			case 4:
				System.out.println( airfield.getLongestRange());
				break;
			case 5:
				airfield.loadCargoJets();
				break;
			case 6:
				airfield.dogfight();
				break;
			case 7:
				airfield.addJet();
				break;
			case 8:
				airfield.removeJet();
				break;
			case 9:
				System.out.println("Stay sharp!");
				keepGoing = false;
				quit(airfield);

			}

		}
	}

	public void quit(Airfield airfield) {
		airfield.closeScanner();
		System.exit(0);
	}

}
