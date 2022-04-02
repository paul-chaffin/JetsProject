package com.skilldistillery.jets.entities;

public class JetFighter extends Jet {

	private String model;
	private double speed;
	private int range;
	private long price;

	public JetFighter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JetFighter(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		double howLong = this.range / this.speed;
		System.out.println(this.model + " can fly for " + howLong + " hours");
	}

	@Override
	public String toString() {
		return "JetFighter [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
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
