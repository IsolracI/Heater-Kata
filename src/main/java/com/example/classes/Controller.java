package com.example.classes;

import com.example.Types.RegulatorDisplayCodes;
import com.example.interfaces.Heater;
import com.example.interfaces.Thermometer;

public class Controller {
    
    private void message(RegulatorDisplayCodes code, RoomTemperature temperature) {
        switch (code) {
            case HEATING:
                System.out.println("Calentando => temperatura " + temperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Apagado => temperatura " + temperature.getTemperature());
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }

    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature){
        RegulatorDisplayCodes code;

        while (t.read(temperature) > maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }

        while (t.read(temperature) < minTemp ) {
            code = 
        }

    }

}
