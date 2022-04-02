package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.*;

public class JetsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApplication jetsApp = new JetsApplication();
		Airfield airfield = new Airfield();
		jetsApp.run();
		airfield.loadJets();
		airfield.flyAllJets();

	}

	public void run() {

	}

	public void displayMenu() {

	}

	public void listFleet() {
		// fore(Jet in fleet){
		Jet.fly();
	}


	public Jet viewFastest() {
		// Jet current;
		// Jet fastest;
		// fore(Jet in fleet){
//		current = Jet.getSpeed();
//		If (current > fastest){
//			current = fastest;}
//		fastest.fly();

	}

	public Jet viewLongestRange() {

	}

	public void addJet(Jet jetToPush) {

	}

	public void removeJet(Jet jetToPop) {

	}

	public void quit() {
		System.exit(0);
	}

}
