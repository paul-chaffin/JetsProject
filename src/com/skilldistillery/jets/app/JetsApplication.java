package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.*;

public class JetsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApplication jetsApp = new JetsApplication();
		Airfield airfield = new Airfield();
		jetsApp.run();
		airfield.loadJets();
		airfield.removeJet();
//		airfield.flyAllJets();
//		System.out.println(airfield.getLongestRange());
//		airfield.loadCargoJets();
//		System.out.println(airfield.getFastest());
//		airfield.addJet();

	}

	public void run() {

	}

	public void displayMenu() {

	}

	public void listFleet() {
	}

	public Jet viewFastest() {

	}

	public Jet viewLongestRange() {

	}

	public void quit(Airfield airfield) {
		airfield.closeScanner();
		System.exit(0);
	}

}
