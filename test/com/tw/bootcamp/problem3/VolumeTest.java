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
        assertTrue(volumeInGallon.isEqual(volumeInLiters));
    }

    @Test
    @DisplayName("invalid volume units")
    void shouldThrowErrorForInvalidVolumeUnits(){
        assertThrows(InvalidVolumeUnitsException.class,()->Volume.createLiters(-2));
    }
}