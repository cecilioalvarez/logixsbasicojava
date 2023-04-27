package com.arquitecturajava.jdbc3.repositories;

import java.util.List;

import com.arquitecturajava.jdbc3.dominio.Ordenador;

public interface OrdenadorRepository {

    Ordenador actualizar(Ordenador ordenador); 
    Ordenador insertar(Ordenador ordenador); 
    void borrar(Ordenador ordenador);
    List<Ordenador> buscarTodos();
    List<Ordenador> buscarOrdenadoresBaratos();
    Ordenador buscarUno(int numero);
    List<Ordenador> buscarPorRangoPrecios(double precioInicial, double precioFinal);

}