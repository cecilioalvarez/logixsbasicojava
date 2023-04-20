package com.arquitecturajava.manejoclases.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases.Persona;

public class PersonaTest {

    @Test
    public void estaJubiladoTest() {

        Persona persona1= new Persona("pepe","gomez",75);
        assertTrue (persona1.estaJubilado());
    }
    
}
