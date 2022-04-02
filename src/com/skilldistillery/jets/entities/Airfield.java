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
		List<String> intake = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				intake.add(line);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
//		System.out.println(intake);
//		parkJets(intake);
		System.out.println(intake.get(0));
	}

	public void parkJets(List<String> intake) {
		for (int i =0;i < intake.size() - 1; i++) {
			
		}
	}

}
