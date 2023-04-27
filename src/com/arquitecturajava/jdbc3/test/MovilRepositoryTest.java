package com.arquitecturajava.jdbc3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.jdbc3.config.CargadorConsultasSQL;
import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.config.LectorFichero;
import com.arquitecturajava.jdbc3.dominio.Movil;
import com.arquitecturajava.jdbc3.repositories.MovilRepository;
import com.arquitecturajava.jdbc3.repositories.MovilRepositoryMySQL;

public class MovilRepositoryTest {
    


     // variable de tipo interface
     private static MovilRepository repositorio;

     @BeforeAll
     public static void inicializarGlobal() {
         //instancio un solo objeto para todos
         repositorio= new MovilRepositoryMySQL();
     }
 
     @BeforeEach
     public void inicializar() throws IOException {
 
         LectorFichero lector = new LectorFichero("cargadatosinicialMovil.sql");
         DataBaseHelper dataBaseHelper = new DataBaseHelper();
         CargadorConsultasSQL cargador = new CargadorConsultasSQL(lector, dataBaseHelper);
         cargador.cargarFichero();
     }
     @Test
    public void insertarTest() {

        Movil movil = new Movil(600500400, "tablet", "standard");
        Movil movilInsertado= repositorio.insertar(movil);
        assertEquals(movil,movilInsertado);


    }
}
