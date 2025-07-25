package com.example;

import com.example.interfaces.Heater;
import com.example.interfaces.Thermometer;

public class Controller {

    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {
        while (thermometer.read(temperature) > maxTemp) { // I have no idea why everyone else chooses to write this instead of 'RoomTemperature temperature.getTemperature()'
            heater.disengage(temperature);
            System.out.println(temperature.getTemperature()); 
        }
        
        while (temperature.getTemperature() < minTemp) { // I also don't understand this whole 'static' thing, why can't I specify the interface? isn't that what I'm always suposed to do?
            heater.engage(temperature);
            System.out.println(temperature.getTemperature());
        }
    }
}
