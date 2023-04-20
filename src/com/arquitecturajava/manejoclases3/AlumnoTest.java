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

    @Test
    public void mejorNotaTest() {

            //arrange
            Alumno alumno= new Alumno("pedro");
            //act
            alumno.addNota(new Nota (5));
            alumno.addNota(new Nota (2));
            alumno.addNota(new Nota (7));
            alumno.addNota(new Nota (9));
            alumno.addNota(new Nota (8));
          
            Nota notaMayor=alumno.getMejorNota();

            //assert 
            assertEquals(9,notaMayor.getValor());

    }
}
