package com.example;

public class Controller {

    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {
        while (thermometer.read(temperature) > maxTemp) { // I have no idea why everyone else chooses to write this instead of 'RoomTemperature temperature.getTemperature()'
            heater.disengage(temperature.getTemperature());
        }
        
        while (temperature.getTemperature() < minTemp) { // I also don't undestand this whole 'static' thing, why can't I specify the interface? isn't that what I'm always suposed to do?
            heater.engage(temperature.getTemperature());
        }
    }
}
