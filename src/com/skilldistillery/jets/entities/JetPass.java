package com.skilldistillery.jets.entities;

public class JetPass extends Jet {

	private String model;
	private double speed;
	private int range;
	private long price;

	public JetPass() {
		super();
	}

	public JetPass(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		
	}

//	public void fly() {
//		Double flightTime = (this.range / this.speed);
//		StringBuilder sb = new StringBuilder();
//		sb.append("Model: " + this.model);
//		sb.append(" | Speed: " + this.speed);
//		sb.append(" | Range: " + this.range);
//		sb.append(" | Price: " + this.price);
//		System.out.print(sb + " | Flight time: ");
//		System.out.printf("%3.2f%n hrs", flightTime);
//	}

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

	@Override
	public String toString() {
		return "\tJet Model: " + model + "\n\tSpeed: " + speed + " mph\n\tRange: " + range + " mi\n\tPrice: $" + price + "\n";
	}

}
