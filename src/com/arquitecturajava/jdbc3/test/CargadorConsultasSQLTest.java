package com.arquitecturajava.jdbc3.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.arquitecturajava.jdbc3.config.CargadorConsultasSQL;
import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.config.LectorFichero;

public class CargadorConsultasSQLTest {
    /* 
    @Test
    void testCargarFichero() throws IOException {
        LectorFichero lector= new LectorFichero("cargadatos.sql");
        DataBaseHelper dataBaseHelper= new DataBaseHelper();
        CargadorConsultasSQL cargador= new CargadorConsultasSQL(lector, dataBaseHelper);
        int lineas=cargador.cargarFichero();
        assertEquals(1, lineas);
    }*/

    @Test
    void testCargarFichero() throws IOException {

        // no es una prueba unitaria
        LectorFichero lectorMock= Mockito.mock(LectorFichero.class);
        List<String> listaConsultas= new ArrayList<String>();
        listaConsultas.add("insert into ordenador (numero,modelo,precio) values (5,'m1',200);");
        listaConsultas.add("insert into ordenador (numero,modelo,precio) values (7,'m1',200);");
        // solo simulo ese metodo
        when(lectorMock.leerLineas()).thenReturn(listaConsultas);
        //porque le mockeo pero no le uso para nada objeto vacio
        DataBaseHelper dataBaseHelperMock= Mockito.mock(DataBaseHelper.class);
        CargadorConsultasSQL cargador= new CargadorConsultasSQL(lectorMock, dataBaseHelperMock);
        
        //act
        int lineas=cargador.cargarFichero();
        //assertiions
        verify(dataBaseHelperMock, times(2)).executarConsulta(anyString());
        assertEquals(2, lineas);
    }
}
