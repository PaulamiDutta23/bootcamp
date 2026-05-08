package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {

    @Test
    @DisplayName("gallon to liters")
    void shouldCheckVolumeGallonToLiters(){
        Volume volumeInGallon = Volume.createGallon(1);
        Volume volumeInLiters = Volume.createLiters(3.78);
        assertTrue(volumeInGallon.equals(volumeInLiters));
    }

    @Test
    @DisplayName("invalid volume units")
    void shouldThrowErrorForInvalidVolumeUnits(){
        assertThrows(InvalidVolumeUnitsException.class,()->Volume.createLiters(-2));
    }

    @Test
    @DisplayName("add one gallon, one liter")
    void shouldAddGallonAndLiter(){
        Volume volumeInGallon = Volume.createGallon(1);
        Volume volumeInLiters = Volume.createLiters(1);
        assertEquals(Volume.createLiters(4.78),volumeInGallon.add(volumeInLiters));
    }
}