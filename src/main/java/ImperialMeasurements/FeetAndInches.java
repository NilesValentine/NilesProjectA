package ImperialMeasurements;



public class FeetAndInches {
	
	int feet; // Imperial measurements
	int inches; //Imperial Measurements 
	
	double cFeet = (double) feet * 30.48; // Metric translation
	double cInches = (double) inches *2.54; //Metric translation
	double cTotal = cFeet + cInches; //total should always be calculated in metrics 
	
	
	}
	


