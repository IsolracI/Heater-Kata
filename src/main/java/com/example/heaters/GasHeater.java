package com.example.heaters;

import com.example.RoomTemperature;
import com.example.interfaces.Heater;

public class GasHeater implements Heater{

    @Override
    public void engage(RoomTemperature temperature) { // it should be named 'cool down' and 'heat up' or something like that, not 'engage' and 'disengage'!!
        temperature.increaseTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.decreaseTemperature(1);
    }
    
}
