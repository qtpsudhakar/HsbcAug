package com.java.intr;

public class CreateCars {

	public static void main(String[] args) {
		
		TataNano car1 = new TataNano();
		car1.addBS6();
		car1.addFourGear();
		car1.addGPS();
		car1.addMirrors();
		car1.addMusicSystem();
		car1.addRearEngine();
		car1.addSeats();
		car1.addWheels();

		TataCars car2 = new TataIndica();
		//car2.addBS6();
		//car2.addFourGear();
		car2.addGPS();
		car2.addMirrors();
		car2.addMusicSystem();
		//car2.addRearEngine();
		car2.addSeats();
		car2.addWheels();
		
		Irs car3 = new TataNano();
		car3.addBS6();
		
		Irs car4 = (Irs) car2;
	}

}













