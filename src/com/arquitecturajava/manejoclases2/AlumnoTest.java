package com.arquitecturajava.manejoclases2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AlumnoTest {
    
    @Test
    public void notaMayorTestA() {

        Nota nota1= new Nota (5);
        Nota nota2= new Nota(7);
        Nota nota3= new Nota (10);

        Alumno alumno= new Alumno(nota1,nota2,nota3);

        Nota notaMayor= alumno.getNotaMayor();

        assertEquals( nota3, notaMayor);
    }
    @Test
    public void notaMayorTestB() {

        Nota nota1= new Nota (10);
        Nota nota2= new Nota(6);
        Nota nota3= new Nota (2);

        Alumno alumno= new Alumno(nota1,nota2,nota3);

        Nota notaMayor= alumno.getNotaMayor();

        assertEquals( nota1, notaMayor);
    }

}


