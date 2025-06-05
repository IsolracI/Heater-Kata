package com.example.classes;

public class RoomTemperature {
    private double temperature = 0.00;
	private static RoomTemperature instance = null;
	
	private RoomTemperature() {}

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
	
	public void increaseTemperature(double increment) {
		this.temperature += increment;
	}

	public void decreaseTemperature(double decrement) {
		this.temperature -= decrement;
	}
}
