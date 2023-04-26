package com.arquitecturajava.jdbc2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrdenadorARTest {

    // FIRST

    // Fast Independent Repetible , Selt Validation , Timely

    @BeforeEach
    public void inicializar() throws IOException {

        LectorFichero lector = new LectorFichero("cargadatosinicial.sql");
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        CargadorConsultasSQL cargador = new CargadorConsultasSQL(lector, dataBaseHelper);
        cargador.cargarFichero();
    }

    @Test
    public void buscarTodosTest() {

        List<OrdenadorAR> lista = OrdenadorAR.buscarTodos();

        assertTrue(lista.size() > 5);

    }

    @Test
    public void buscarOrdenadoresBaratosTest() {

        List<OrdenadorAR> lista = OrdenadorAR.buscarOrdenadoresBaratos();

        assertTrue(lista.size()>=2);

    }

    @Test
    public void buscarUnoEncontradoTest() {

        OrdenadorAR ordenador = OrdenadorAR.buscarUno(1);

        assertEquals(1, ordenador.getNumero());
        assertEquals("m1", ordenador.getModelo());
        assertEquals(500, ordenador.getPrecio(), 0);

    }

    @Test
    public void buscarUnoNoEncontradoTest() {

        OrdenadorAR ordenador = OrdenadorAR.buscarUno(1000);
        assertNull(ordenador);
    }

    @Test
    public void borrarTest() {

        OrdenadorAR ordenador = new OrdenadorAR(1);
        ordenador.borrar();
        OrdenadorAR ordenadorBorrado = OrdenadorAR.buscarUno(1);
       assertNull(ordenadorBorrado);;
    }

    @Test
    public void insertarTest() throws SQLException {

        OrdenadorAR ordenador = new OrdenadorAR(10, "tablet", 1000);
        OrdenadorAR ordenadorInsertado= ordenador.insertar();
        assertEquals(ordenador,ordenadorInsertado);
    }

    @Test
    public void actualizarTest() throws SQLException {

        OrdenadorAR ordenador = new OrdenadorAR(10, "tablet", 1000);
        ordenador.setModelo("otro");
        ordenador.setPrecio(100);
        OrdenadorAR ordenadorActualizado= ordenador.actualizar();
        
        assertEquals(ordenador,ordenadorActualizado);
    }


}
