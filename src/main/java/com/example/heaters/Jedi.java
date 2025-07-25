package com.example.heaters;

import com.example.RoomTemperature;
import com.example.interfaces.Heater;

public class Jedi implements Heater{
    private String name;

    public Jedi(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.increaseTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.decreaseTemperature(1);
    }

    public void speak() {
        System.out.println(getName() + " says: strong with the 0s and 1s, you are? (I have no idea what you want me to do with this shit)");
    }
}
