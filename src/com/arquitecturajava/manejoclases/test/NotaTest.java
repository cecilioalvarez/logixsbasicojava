package com.arquitecturajava.manejoclases.test;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases.Nota;

public class NotaTest {

    @Test
    @Tag("notas")
    public void estaAprobadaTest() {

        Nota nota = new Nota(6);
        boolean valorAprobada = nota.estaAprobada();
        assertTrue(valorAprobada);

    }

    @Test
    @Tag("notas")
    @DisplayName(" Una nota negativa genera una exception ")
    public void notaNegativaExceptionTest() {

        assertThrows(IllegalArgumentException.class, () -> new Nota(-1));

    }

    @Test
    @Tag("notas")
    public void notaMayorDe10ExceptionTest() {

        assertThrows(IllegalArgumentException.class, () -> new Nota(11));

    }

    @Test
    @Tag("notas")
    public void calificacionSuspensoTest() {

    
        Nota nota3 = new Nota(3);
        String suspenso = nota3.getCalificacion();
        assertEquals("Suspenso", suspenso);
       
    }

    
    // valida una situacion limite
    @Test
    @Tag("notas")
    public void calificacionAprobado5JustoTest() {

        Nota nota5= new Nota (5);
        String aprobada= nota5.getCalificacion();
        assertEquals("Aprobado",aprobada);
        
    }



    @Test
    @Tag("notas")
    public void calificacionAprobadoTest() {

  
        Nota nota6 = new Nota(6);
        String aprobado = nota6.getCalificacion();
        assertEquals("Aprobado", aprobado);

    }
}
