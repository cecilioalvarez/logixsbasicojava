package com.arquitecturajava.jdbc3.repositories;

import java.util.List;

import com.arquitecturajava.jdbc3.dominio.Movil;

public interface MovilRepository {
    
    Movil actualizar(Movil ordenador); 
    Movil insertar(Movil ordenador); 
    void borrar(Movil ordenador);
    List<Movil> buscarTodos(); 
    Movil buscarUno(int numero);


}
