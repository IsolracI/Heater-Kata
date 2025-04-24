package com.example;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
    	final double MIN_TEMP = 15.0;
        final double MAX_TEMP = 21.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
/*        temperature.setTemperature(17);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
                 
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);
        
        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi("Yoda");
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, MIN_TEMP, MAX_TEMP, temperature);
        yoda.speak();

        Heater grogu = new Jedi("Grogu");
        ((Jedi)grogu).speak(); // ups, The method speak() is undefined for the type HeaterJava
*/    }
}
