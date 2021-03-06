package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet() {
	}

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
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

	public void setSpeed(int speed) {
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

	public void fly() {
		Double flightTime = (getRange() / getSpeed());
		StringBuilder sb = new StringBuilder();
		sb.append("\nModel: " + getModel());
		sb.append(" | Speed (mph): " + getSpeed());
		sb.append(" | Range (mi): " + getRange());
		sb.append(" | Price (USD): " + getPrice());
		System.out.print(sb);
		System.out.printf(" | Flight time (hrs): %3.2f%n", flightTime);
	}

	@Override
	public String toString() {
		return "\tJet Model: " + model + "\n\tSpeed: " + speed + " mph\n\tRange: " + range + " mi\n\tPrice: $" + price
				+ "\n";
	}

}
