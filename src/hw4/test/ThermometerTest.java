package hw4.test;

import hw4.Thermometer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThermometerTest {
    private Thermometer thermometer;
    @Test
    public void testConvertToFahrenheit(){
        thermometer = new Thermometer(32,227);
        Assertions.assertEquals(90,thermometer.convertToFahrenheit());
    }

    @Test
    public void testConvertToCelsius(){
        thermometer = new Thermometer(32,227);
        Assertions.assertEquals(109,thermometer.convertToCelsius());
    }
}
