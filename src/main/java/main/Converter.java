package main;
import ImperialMeasurements.FeetAndInches;
import ImperialMeasurements.PoundsAndOunces;

import java.util.Scanner;

public class Converter {
	
	
	int menuSelection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose your imperial-to-metric unit converter: ");
		System.out.println("1. Feet to centimeters");
		System.out.println("2. Pounds to grams");
		
		String line = scanner.nextLine();
		System.out.println("You have chosen " + line);
		
		
		
	
	}
	
}
	



