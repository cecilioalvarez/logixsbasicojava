package com.arquitecturajava.jdbc3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.jdbc3.config.LectorFichero;

public class LectorFicheroTest {
    @Test
    void testLeerLineas() throws IOException {

        LectorFichero lector= new LectorFichero("cargaDatos.sql");
        int lineas= lector.leerLineas().size();
        assertEquals(1,lineas);
    }
}
