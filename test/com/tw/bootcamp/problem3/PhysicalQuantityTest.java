package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhysicalQuantityTest {
    @Test
    void shouldCheckEqualityOfTemperature() {
        PhysicalQuantity fahrenheitTemperature = PhysicalQuantity.create(212, TemperatureUnits.F);
        PhysicalQuantity celsiusTemperature = PhysicalQuantity.create(100, TemperatureUnits.C);
        assertTrue(fahrenheitTemperature.equals(celsiusTemperature));
    }
}
