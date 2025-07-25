package com.example;

import com.example.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {

    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
    
}
