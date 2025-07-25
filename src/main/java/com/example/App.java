package com.example;

import com.example.heaters.GasHeater;
import com.example.heaters.Jedi;
import com.example.interfaces.Heater;
import com.example.interfaces.Thermometer;

public class App {
    
    public static void main( String[] args ) {
    	final double MIN_TEMP = 15.0;
        final double MAX_TEMP = 21.0;
        
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(33.0);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Controller regulator = new Controller();
         
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);
        
        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi("Yoda");
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, MIN_TEMP, MAX_TEMP, temperature);
        yoda.speak();

        Heater grogu = new Jedi("Grogu");
        ((Jedi)grogu).speak(); // ups, The method speak() is undefined for the type HeaterJava

    }
}
