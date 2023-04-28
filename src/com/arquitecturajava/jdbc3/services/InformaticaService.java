package com.arquitecturajava.jdbc3.services;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.jdbc3.dominio.Movil;
import com.arquitecturajava.jdbc3.dominio.Ordenador;
import com.arquitecturajava.jdbc3.repositories.MovilRepository;
import com.arquitecturajava.jdbc3.repositories.OrdenadorRepository;

public class InformaticaService {
    
    private MovilRepository repositorioMovil;
    private OrdenadorRepository repositorioOrdenador;
    
    public InformaticaService(MovilRepository repositorioMovil, OrdenadorRepository repositorioOrdenador) {
        this.repositorioMovil = repositorioMovil;
        this.repositorioOrdenador = repositorioOrdenador;
    }

    public Movil actualizarMovil(Movil movil) {
        return repositorioMovil.actualizar(movil);
    }

    public Movil insertarMovil(Movil movil) {
        return repositorioMovil.insertar(movil);
    }

    public void borrarMovil(Movil movil) {
        repositorioMovil.borrar(movil);
    }

    public void borrarMoviles(List<Movil> moviles) {
        for (Movil movil:moviles) {
            repositorioMovil.borrar(movil);
        }
        
    }

    public List<Movil> buscarTodosMoviles() {
        List<Movil> lista= repositorioMovil.buscarTodos();
        for (Movil m:lista) {

            m.setContrato(m.getContrato().toUpperCase());
        }
        return lista;
    }

    public Movil buscarUnoMovil(int numero) {
        return repositorioMovil.buscarUno(numero);
    }

    public Ordenador actualizarOrdenador(Ordenador ordenador) {
        return repositorioOrdenador.actualizar(ordenador);
    }

    public Ordenador insertarOrdenador(Ordenador ordenador) {
        return repositorioOrdenador.insertar(ordenador);
    }

    public List<Ordenador> insertarOrdenadores(List<Ordenador> ordenadores) {

        for (Ordenador ordenador: ordenadores) {
         ordenador.addRecargo();
         repositorioOrdenador.insertar(ordenador);
        }
        return ordenadores;
    }


    public void borrarOrdenador(Ordenador ordenador) {
        repositorioOrdenador.borrar(ordenador);
    }

    public void borrarOrdenadores(List<Ordenador> lista) {
        for (Ordenador o: lista) {

            repositorioOrdenador.borrar(o);
        }
       
    }

    public List<Ordenador> buscarTodosOrdenadores() {
        return repositorioOrdenador.buscarTodos();
    }

    public List<Ordenador> buscarOrdenadoresBaratos() {
        return repositorioOrdenador.buscarOrdenadoresBaratos();
    }

    public Ordenador buscarUnoOrdenador(int numero) {
        return repositorioOrdenador.buscarUno(numero);
    }

    public List<Ordenador> buscarPorRangoPreciosORdenadores(double precioInicial, double precioFinal) {
        return repositorioOrdenador.buscarPorRangoPrecios(precioInicial, precioFinal);
    }

    
}
