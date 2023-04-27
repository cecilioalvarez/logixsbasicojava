package com.arquitecturajava.jdbc3.testintegracion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.jdbc3.config.CargadorConsultasSQL;
import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.config.LectorFichero;
import com.arquitecturajava.jdbc3.dominio.Movil;
import com.arquitecturajava.jdbc3.repositories.MovilRepository;
import com.arquitecturajava.jdbc3.repositories.MovilRepositoryMySQL;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepository;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepositoryMySQL;
import com.arquitecturajava.jdbc3.services.InformaticaService;

public class InformaticaServiceTest {
    
    private static OrdenadorRepository repositorioOrdenador;
    private static MovilRepository repositorioMovil;
    private static InformaticaService servicioInformatica;

    @BeforeAll
    public static void inicializarGlobal() {
        //instancio un solo objeto para todos
        repositorioOrdenador= new OrdenadorRepositoryMySQL();
        repositorioMovil= new MovilRepositoryMySQL();
        servicioInformatica= new InformaticaService(repositorioMovil,repositorioOrdenador);
    }

    @BeforeEach
    public void inicializar() throws IOException {

        LectorFichero lector = new LectorFichero("cargadatosinicial.sql");
        LectorFichero lector2 = new LectorFichero("cargadatosinicialMovil.sql");

        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        
        CargadorConsultasSQL cargador = new CargadorConsultasSQL(lector, dataBaseHelper);
        CargadorConsultasSQL cargador2 = new CargadorConsultasSQL(lector2, dataBaseHelper);
        cargador.cargarFichero();
        cargador2.cargarFichero();
    }
    
    @Test
    public void buscarTodosMovilesTest() {

        List<Movil> lista =servicioInformatica.buscarTodosMoviles();

        assertTrue(lista.size() > 4);

    }




}
