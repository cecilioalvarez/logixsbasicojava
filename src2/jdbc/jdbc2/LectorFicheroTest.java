package com.arquitecturajava.jdbc2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class LectorFicheroTest {
    @Test
    void testLeerLineas() throws IOException {

        LectorFichero lector= new LectorFichero("cargaDatos.sql");
        int lineas= lector.leerLineas().size();
        assertEquals(1,lineas);
    }
}
