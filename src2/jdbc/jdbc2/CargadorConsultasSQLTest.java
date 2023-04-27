package com.arquitecturajava.jdbc2;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class CargadorConsultasSQLTest {
    @Test
    void testCargarFichero() throws IOException {
        LectorFichero lector= new LectorFichero("cargadatos.sql");
        DataBaseHelper dataBaseHelper= new DataBaseHelper();
        CargadorConsultasSQL cargador= new CargadorConsultasSQL(lector, dataBaseHelper);
        int lineas=cargador.cargarFichero();
        assertEquals(1, lineas);
    }
}
