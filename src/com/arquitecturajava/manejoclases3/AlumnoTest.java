package com.arquitecturajava.manejoclases3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class AlumnoTest {
    
    @Test
    public void añadirNotaTest() {

            Alumno alumno= new Alumno("pedro");
      
            alumno.addNota(new Nota (5));
            int numeroNotas= alumno.getNotas().size();

            assertEquals(1,numeroNotas);

    }

    @Test
    public void mejorNotaTest() {

       
            Alumno alumno= new Alumno("pedro");
            ArrayList<Nota> lista=crearNotas(5,2,7,9,1);
            alumno.setNotas(lista);

            Nota notaMayor=alumno.getMejorNota();

            assertEquals(9,notaMayor.getValor());

    }

    @Test
    public void notaMediaTest() {

            //arrange
            Alumno alumno= new Alumno("pedro");
            ArrayList<Nota> lista= crearNotas(7,2,6,8,8);
            alumno.setNotas(lista);

            Nota notaMedia=alumno.getNotaMedia();

            assertEquals(6.2,notaMedia.getValor());

    }
    // parametro con argumento variable
    private ArrayList<Nota> crearNotas(double ... valores) {

        ArrayList<Nota> lista= new ArrayList<Nota>();
        for (double valor : valores) {
            lista.add(new Nota (valor));
        }
        return lista;
        
    }
}
