package com.arquitecturajava.jdbc3;

import java.sql.SQLException;
import java.util.List;

public interface OrdenadorRepository {

    Ordenador actualizar(Ordenador ordenador); 

    // su propia persistencia
    Ordenador insertar(Ordenador ordenador); 

    // su propia persistencia
    void borrar(Ordenador ordenador);

    List<Ordenador> buscarTodos();

    List<Ordenador> buscarOrdenadoresBaratos();

    Ordenador buscarUno(int numero);

    List<Ordenador> buscarPorRangoPrecios(double precioInicial, double precioFinal);

}