package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {
// This class should read the file
	private List<Jet> Jets;

	public void loadJets() {
		List<Jet> intake = new ArrayList<>();
		String[] strArr = new String[6];
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				strArr = line.split(",");
				if (strArr[0].equals("Passenger")) {
					String model = strArr[1];
					Double speed = Double.parseDouble(strArr[2]);
					Integer range = Integer.parseInt(strArr[3]);
					Long price = Long.parseLong(strArr[4]);
					intake.add(new JetPass(model, speed, range, price));
					System.out.println("model " + model);
					System.out.println("speed " + speed);
					System.out.println("range " + range);
					System.out.println("price " + price);
					System.out.println(intake.get(0).toString());
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
//		System.out.println(intake);
//		parkJets(intake);
		System.out.println();
	}

	public void parkJets(List<String> intake) {
		for (int i = 0; i < intake.size() - 1; i++) {
		}
	}

}
