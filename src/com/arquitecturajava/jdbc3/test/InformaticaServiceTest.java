package com.arquitecturajava.jdbc3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arquitecturajava.jdbc3.dominio.Movil;
import com.arquitecturajava.jdbc3.dominio.Ordenador;
import com.arquitecturajava.jdbc3.repositories.MovilRepository;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepository;
import com.arquitecturajava.jdbc3.services.InformaticaService;

@ExtendWith(MockitoExtension.class)
public class InformaticaServiceTest {

    @Mock
    private OrdenadorRepository repositorioOrdenadorMock;
    @Mock
    private MovilRepository repositorioMovilMock;
    @InjectMocks
    private InformaticaService servicioInformatica;

    @Test
    public void buscarTodosMovilesTest() {

        Movil movil1 = new Movil(600700800, "iphone", "standard");
        Movil movil2 = new Movil(600700800, "iphone", "standard");
        List<Movil> listaMovilMock = Arrays.asList(movil1, movil2);
        when(repositorioMovilMock.buscarTodos()).thenReturn(listaMovilMock);

        List<Movil> listaMovilResultado = servicioInformatica.buscarTodosMoviles();

        verify(repositorioMovilMock, times(1)).buscarTodos();
        assertEquals(listaMovilMock, listaMovilResultado);
    }

    @Test
    public void borrarOrdenadorTest() {

        Ordenador ordenador = new Ordenador(1);

        servicioInformatica.borrarOrdenador(ordenador);

        verify(repositorioOrdenadorMock, times(1)).borrar(ordenador);
    }

    @Test
    public void borrarOrdenadoresTest() {

        Ordenador o1 = new Ordenador(1);
        Ordenador o2 = new Ordenador(1);
        Ordenador o3 = new Ordenador(1);
        List<Ordenador> lista = List.of(o1,o2,o3);
        
        servicioInformatica.borrarOrdenadores(lista);

        verify(repositorioOrdenadorMock, times(3)).borrar(any(Ordenador.class));
        
    }

    @Test
    public void insertarOrdenadoresTest() {

        Ordenador o1 = mock(Ordenador.class);
        Ordenador o2 = mock(Ordenador.class);
        Ordenador o3 =  mock(Ordenador.class);

        when(o1.getPrecio()).thenReturn(100.0);
        when(o2.getPrecio()).thenReturn(100.0);
        when(o3.getPrecio()).thenReturn(100.0);
        
      
    
        servicioInformatica.insertarOrdenadores(List.of(o1,o2,o3));

        verify(o1, times(1)).addRecargo();
        verify(o2, times(1)).addRecargo();
        verify(o3, times(1)).addRecargo();
        verify(repositorioOrdenadorMock, times(3)).insertar(any(Ordenador.class));
       
        assertEquals (100,o1.getPrecio(),0);
        assertEquals (100,o2.getPrecio(),0);
        assertEquals (100,o3.getPrecio(),0);

        
    }
}
