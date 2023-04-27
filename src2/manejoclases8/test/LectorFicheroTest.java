package com.arquitecturajava.manejoclases8.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.manejoclases8.LectorFichero;

public class LectorFicheroTest {

    

    @Test
    public void noExisteElFicheroTest() throws IOException {

        LectorFichero lector = new LectorFichero("./noexiste.txt");
        Assertions.assertThrows(IOException.class, () -> {
            lector.leerLineas();
        });

    }

    @Test
    public void elFicheroNoEstaVacioTest() throws IOException {

        LectorFichero lector = new LectorFichero("./facturastest1.txt");

        List<String> listaCadenas =lector.leerLineas();

        assertNotNull(listaCadenas);

    }

    @Test
    public void leerElFicheroEnLlineasTest() throws IOException {

        LectorFichero lector = new LectorFichero("facturastest1.txt");
        List<String> listaCadenas =  lector.leerLineas();
        assertEquals(3, listaCadenas.size());

    }

}