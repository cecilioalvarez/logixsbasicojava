package com.arquitecturajava.manejoclases.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases.Nota;

public class NotaTest {
    
    @Test
    public void estaAprobadaTest() {

        Nota nota= new Nota(6); 
        boolean valorAprobada= nota.estaAprobada();
        assertTrue(valorAprobada);

        
    }

    @Test
    public void notaNegativaExceptionTest() {

    
       assertThrows(IllegalArgumentException.class, ()->  new Nota(-1));

        
    }

    @Test
    public void notaMayorDe10ExceptionTest() {

    
       assertThrows(IllegalArgumentException.class, ()->  new Nota(11));

        
    }
}
