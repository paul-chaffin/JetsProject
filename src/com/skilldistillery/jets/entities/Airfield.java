package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

}
