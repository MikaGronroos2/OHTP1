import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.001);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.001);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50));
        assertTrue(converter.isExtremeTemperature(60));
        assertFalse(converter.isExtremeTemperature(20));
    }

    @Test
    void kelvinToFah() {
        assertEquals(59, converter.kelvinToFah(300.1), 0.01);
        assertEquals(32, converter.kelvinToFah(273.15), 0.01);
        assertEquals(132, converter.kelvinToFah(373.15), 0.01);
    }
}