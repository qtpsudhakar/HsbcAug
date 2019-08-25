package com.java.intr;

public interface TataCars {

	public void addWheels(); //abstract method
	public void addMirrors();
	public void addSeats();
	
	public void addGPS();
	
	public default void addMusicSystem() {
		System.out.println("Music system added");
		
	}
}
