package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Airfield {
// This class should read the file
	private List<Jet> Jets;
	private List<Jet> intake = new ArrayList<>();

	public void loadJets() {
		String[] strArr = new String[6];
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				strArr = line.split(",");
				String model = strArr[1];
				Double speed = Double.parseDouble(strArr[2]);
				Integer range = Integer.parseInt(strArr[3]);
				Long price = Long.parseLong(strArr[4]);
				if (strArr[0].equals("Passenger")) {

					intake.add(parkJetPass(model, speed, range, price));
				} else if (strArr[0].equals("Cargo")) {
					intake.add(parkJetCargo(model, speed, range, price));
				} else if (strArr[0].equals("Fighter")) {
					intake.add(parkJetFighter(model, speed, range, price));
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		for (int i = 0; i < intake.size(); i++) {
			System.out.println(intake.get(i).toString());
		}
	}

//TODO fix
	public void addJet() {
		String type = "A";
		String model = "A";
		double speed = 0.0;
		int range = 0;
		long price = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the letter for the type of jet you wish to add: ");
		System.out.println("(C)argo | (P)assenger | (Fighter) > ");
		type = kb.next().toUpperCase();
		System.out.println("What is the model name? > ");
		model = kb.next();
		System.out.println("What is the top speed in mph? > ");
		speed = kb.nextInt();
		System.out.println("What is the fuel range in miles? > ");
		range = kb.nextInt();
		System.out.println("What is the price in USD? (Do not include \'$\') > ");
		price = kb.nextLong();

		switch (type) {
		case "C":
			intake.add(parkJetCargo(model, speed, range, price));
			break;
		case "P":
			intake.add(parkJetPass(model, speed, range, price));
			break;
		case "F":
			intake.add(parkJetCargo(model, speed, range, price));
			break;
		}
		System.out.println("Jet added:\n" + (intake.get(intake.size() - 1).toString()));

	}

	public Jet parkJetCargo(String model, double speed, int range, long price) {

		JetCargo newJet = new JetCargo(model, speed, range, price);
		return newJet;
	}

	public Jet parkJetFighter(String model, double speed, int range, long price) {
		JetFighter newJet = new JetFighter(model, speed, range, price);
		return newJet;
	}

	public Jet parkJetPass(String model, double speed, int range, long price) {
		JetPass newJet = new JetPass(model, speed, range, price);
		return newJet;
	}

	public void flyAllJets() {
		for (Jet jet : intake) {
			jet.fly();
		}
	}

	public String getFastest() {
		double current = 0.0;
		double fastest = 0.0;
		String result = "";
		for (int i = 0; i < intake.size(); i++) {
			current = (intake.get(i).getSpeed());
//			System.out.println("Current: " + current);
			if (current > fastest) {
				fastest = current;
//				System.out.println("Fastest: " + fastest);
			}
			for (Jet jet : intake) {
				if (jet.getSpeed() == fastest) {
					result = "Fastest jet in fleet:\n" + jet.toString();
				}

			}
		}
		return result;
	}

	public String getLongestRange() {
		int current = 0;
		int longest = 0;
		String result = "";
		for (int i = 0; i < intake.size(); i++) {
			current = (intake.get(i).getRange());
			if (current > longest) {
				longest = current;
			}
			for (Jet jet : intake) {
				if (jet.getRange() == longest) {
					result = "Longest range:\n" + jet.toString();
				}

			}
		}
		result = result.toString();
		return result;
	}

//TODO fix
	public void loadCargoJets() {
		for (Jet jet : intake) {
			if (jet instanceof JetCargo) {
				System.out.print(jet.getModel());
				((JetCargo) jet).loadCargo();
			}
		}
	}
}
