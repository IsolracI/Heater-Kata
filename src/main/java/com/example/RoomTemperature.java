package com.example;

public class RoomTemperature {
    private double temperature = 0.00;
	private static RoomTemperature instance = null;
	
	private RoomTemperature() {
	}

	public static RoomTemperature getInstance() {
		if (instance == null) {
			instance = new RoomTemperature();
		}
		return instance;		
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment) {
		this.temperature += increment;
	}
}
