package com.arquitecturajava.manejoclases.test;

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
}
