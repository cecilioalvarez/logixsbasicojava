package com.arquitecturajava.jdbc3.testintegracion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.jdbc3.config.CargadorConsultasSQL;
import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.config.LectorFichero;
import com.arquitecturajava.jdbc3.dominio.Ordenador;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepository;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepositoryMySQL;

public class OrdenadorRepositoryTest {

    // variable de tipo interface
    private static OrdenadorRepository repositorio;

    @BeforeAll
    public static void inicializarGlobal() {
        //instancio un solo objeto para todos
        repositorio= new OrdenadorRepositoryMySQL();
    }

    @BeforeEach
    public void inicializar() throws IOException {

        LectorFichero lector = new LectorFichero("cargadatosinicial.sql");
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        CargadorConsultasSQL cargador = new CargadorConsultasSQL(lector, dataBaseHelper);
        cargador.cargarFichero();
    }

    @Test
    public void buscarTodosTest() {

        List<Ordenador> lista = repositorio.buscarTodos();

        assertTrue(lista.size() > 5);

    }

    @Test
    public void buscarOrdenadoresBaratosTest() {

        List<Ordenador> lista = repositorio.buscarOrdenadoresBaratos();

        assertTrue(lista.size()>=2);

    }

    @Test
    public void buscarUnoEncontradoTest() {

        Ordenador ordenador = repositorio.buscarUno(1);

        assertEquals(1, ordenador.getNumero());
        assertEquals("m1", ordenador.getModelo());
        assertEquals(500, ordenador.getPrecio(), 0);

    }

    @Test
    public void buscarUnoNoEncontradoTest() {

        Ordenador ordenador = repositorio.buscarUno(1000);
        assertNull(ordenador);
    }

    @Test
    public void borrarTest() {

        Ordenador ordenador = new Ordenador(1);
        repositorio.borrar(ordenador);
        Ordenador ordenadorBorrado = repositorio.buscarUno(1);
        assertNull(ordenadorBorrado);;
    }

    @Test
    public void insertarTest()  {

        Ordenador ordenador = new Ordenador(10, "tablet", 1000);
        Ordenador ordenadorInsertado= repositorio.insertar(ordenador);
        assertEquals(ordenador,ordenadorInsertado);
    }

    @Test
    public void actualizarTest()  {

        Ordenador ordenador = new Ordenador(10, "tablet", 1000);
        ordenador.setModelo("otro");
        ordenador.setPrecio(100);
        Ordenador ordenadorActualizado= repositorio.actualizar(ordenador);
        
        assertEquals(ordenador,ordenadorActualizado);
    }


}
