package com.arquitecturajava.jdbc3.testbasicos;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class AlumnoTest {
 
    @Test
    public void notaEstaAprobadaTest() {

        Nota nota=Mockito.mock(Nota.class);
        when(nota.esAprobada()).thenReturn(true);

        Alumno alumno= new Alumno("pepe",nota);

        assertTrue(alumno.notaEstaAprobada());

    }
}
