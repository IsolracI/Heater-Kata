package com.example.interfaces;

import com.example.classes.RoomTemperature;

public interface Heater {
    void engage(RoomTemperature temperature);
    void disengage(RoomTemperature temperature);
}