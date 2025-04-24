package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RoomTemperatureTest {

    RoomTemperature temperature = RoomTemperature.getInstance();
    temperature.setTemperature(34);

    @Test
    public void test_get_temperature() {
        // ARRANGE
        double temperatureExpected = 34;
        // ACT
        double actualTemperature = temperature.getTemperature();
        // ASSERT
        assertEquals(temperatureExpected, actualTemperature);
    }
}
