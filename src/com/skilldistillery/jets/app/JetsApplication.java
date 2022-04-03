package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.*;

public class JetsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApplication jetsApp = new JetsApplication();
		Airfield airfield = new Airfield();
		jetsApp.run(airfield);
		airfield.listFleet();
		airfield.dogfight();

	}

	public void run(Airfield airfield) {
		airfield.loadJets();
//		displayMenu();
	}

	public void displayMenu(Airfield airfield) {
		boolean quitFlag = false;
		System.out.println("Welcome to the airfield! What would you like to do?");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Dogfight!");
		System.out.println("1. List fleet");
		System.out.println("1. List fleet");
		System.out.println("1. List fleet");
	}


	public void quit(Airfield airfield) {
		airfield.closeScanner();
		System.exit(0);
	}

}
