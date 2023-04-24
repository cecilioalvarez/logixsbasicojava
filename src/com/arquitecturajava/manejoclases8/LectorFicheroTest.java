package com.arquitecturajava.manejoclases8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LectorFicheroTest {

    

    @Test
    public void elFicheroNoExiste() throws IOException {

        LectorFichero lector = new LectorFichero("./noexiste.txt");
        Assertions.assertThrows(IOException.class, () -> {
            lector.leerLineas();
        });

    }

    @Test
    public void leerLineasNoesNulo() throws IOException {

        LectorFichero lector = new LectorFichero("./facturastest1.txt");

        List<String> listaCadenas =lector.leerLineas();

        assertNotNull(listaCadenas);

    }

    @Test
    public void leerLineasDeFichero() throws IOException {

        LectorFichero lector = new LectorFichero("facturastest1.txt");
        List<String> listaCadenas =  lector.leerLineas();
        assertEquals(3, listaCadenas.size());

    }

}