package com.arquitecturajava.jdbc3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arquitecturajava.jdbc3.config.CargadorConsultasSQL;
import com.arquitecturajava.jdbc3.config.DataBaseHelper;
import com.arquitecturajava.jdbc3.config.LectorFichero;
import com.arquitecturajava.jdbc3.dominio.Movil;
import com.arquitecturajava.jdbc3.dominio.Ordenador;
import com.arquitecturajava.jdbc3.repositories.MovilRepository;
import com.arquitecturajava.jdbc3.repositories.MovilRepositoryMySQL;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepository;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepositoryMySQL;
import com.arquitecturajava.jdbc3.services.InformaticaService;

public class InformaticaServiceTest {
    
    private static OrdenadorRepository repositorioOrdenador;
    private static MovilRepository repositorioMovil;
    private static InformaticaService servicioInformatica;

    /* 
    @BeforeAll
    public static void inicializarGlobal() {
        //instancio un solo objeto para todos
        repositorioOrdenador= new OrdenadorRepositoryMySQL();
        repositorioMovil= new MovilRepositoryMySQL();
        servicioInformatica= new InformaticaService(repositorioMovil,repositorioOrdenador);
    }
    */
    /* 
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

    */
    
    @Test
    public void buscarTodosMovilesTest() {

        
        MovilRepository repositorioMovilMock=mock(MovilRepository.class);
        OrdenadorRepository repositorioOrdenadorMock=mock(OrdenadorRepository.class);

        //crear lista
        Movil movil1= new Movil(600700800,"iphone","standard");
        Movil movil2= new Movil(600700800,"iphone","standard");
        List<Movil> listaMovilMock=Arrays.asList(movil1,movil2);

        //mock
        when(repositorioMovilMock.buscarTodos()).thenReturn(listaMovilMock);
        InformaticaService servicioInformatica= new InformaticaService(repositorioMovilMock,repositorioOrdenadorMock);
      
        //act
        List<Movil> listaMovilResultado =servicioInformatica.buscarTodosMoviles();

        verify(repositorioMovilMock,times(1)).buscarTodos();
        assertEquals(listaMovilMock,listaMovilResultado);

    }

    @Test
    public void borrarOrdenadorTest() {

        //arrange
        MovilRepository repositorioMovilMock=mock(MovilRepository.class);
        OrdenadorRepository repositorioOrdenadorMock=mock(OrdenadorRepository.class);
        InformaticaService servicioInformatica= new InformaticaService(repositorioMovilMock,repositorioOrdenadorMock);
        Ordenador ordenador= new Ordenador(1);

        //act
        servicioInformatica.borrarOrdenador(ordenador);

        //assertions //esto muy bien porque 
        verify(repositorioOrdenadorMock,times(1)).borrar(ordenador);
       

    }




}
