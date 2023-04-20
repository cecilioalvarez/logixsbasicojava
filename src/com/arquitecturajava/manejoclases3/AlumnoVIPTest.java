package com.arquitecturajava.manejoclases3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AlumnoVIPTest {
    @Test
    void porcentajeBecaTest() {

        AlumnoVIP alumno= new AlumnoVIP("pedro","normal");

        double porcentajeBeca= alumno.getPorcentajeBeca();

        assertEquals(30, porcentajeBeca,0);


    }
}
