package com.example.classes;

import com.example.interfaces.Heater;

public class GasHeater implements Heater{


    @Override
    public void engage(RoomTemperature temperature) {
        temperature.increaseTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
                temperature.decreaseTemperature(1);
    }
    
}
