package com.skilldistillery.jets.entities;

public class JetCargo extends Jet {

	

	public JetCargo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public JetCargo(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}



	public void loadCargo() {
		System.out.println("Loading cargo...");
	}

}
