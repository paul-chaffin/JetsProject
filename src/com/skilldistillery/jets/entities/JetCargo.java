package com.skilldistillery.jets.entities;

public class JetCargo extends Jet {

	private String model;
	private double speed;
	private int range;
	private long price;

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



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public int getRange() {
		return range;
	}



	public void setRange(int range) {
		this.range = range;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}

}
