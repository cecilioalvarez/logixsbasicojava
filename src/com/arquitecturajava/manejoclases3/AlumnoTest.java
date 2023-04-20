package com.arquitecturajava.manejoclases3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

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
            ArrayList<Nota> lista= new ArrayList<Nota>();
            lista.add(new Nota (5));
            lista.add(new Nota (2));
            lista.add(new Nota (7));
            lista.add(new Nota (9));
            lista.add(new Nota (8));
            alumno.setNotas(lista);

            //act 
            Nota notaMayor=alumno.getMejorNota();

            //assert 
            assertEquals(9,notaMayor.getValor());

    }
}
