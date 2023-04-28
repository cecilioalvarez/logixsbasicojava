package com.arquitecturajava.jdbc3.testbasicos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AlumnoTest {

    @Test
    public void notaEstaAprobadaTest() {

        Nota nota1 = mock(Nota.class);
        when(nota1.esAprobada()).thenReturn(true);

        Nota nota2 = mock(Nota.class);
        when(nota2.esAprobada()).thenReturn(false);
        Nota nota3 = mock(Nota.class);
        when(nota3.esAprobada()).thenReturn(true);
        List<Nota> lista = mock(ArrayList.class);
        
        when (lista.get(0)).thenReturn(nota1);
        when (lista.get(1)).thenReturn(nota1);
        when (lista.get(2)).thenReturn(nota1);

        Alumno a = new Alumno("pedro", lista);

        assertEquals(2, a.aprobados());

    }
}
