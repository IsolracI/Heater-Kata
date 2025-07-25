package com.example;

public class GasHeater implements Heater{

    @Override
    public void engage(double temperature) { // it should be named 'cool down' and 'heat up' or something like that, not 'engage' and 'disengage'!!
        temperature += 1;
    }

    @Override
    public void disengage(double temperature) {
        temperature -= 1;
    }
    
}
