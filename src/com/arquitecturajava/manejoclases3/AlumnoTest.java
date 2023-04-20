package com.arquitecturajava.manejoclases3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AlumnoTest {
    
    @Test
    public void añadirNotaTest() {

            //arrange
            Alumno alumno= new Alumno("pedro");
            //act
            alumno.addNota(new Nota (5));
            int numeroNotas= alumno.getNotas().size();

            //assert 
            assertEquals(1,numeroNotas);

    }
}
