package com.arquitecturajava.jdbc3.testbasicos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    
    private String nombre;
    private List<Nota> notas= new ArrayList<Nota>();
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        
    }

    
    public Alumno(String nombre, List<Nota> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }


    public void addNota(Nota nota) {

        this.notas.add(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int aprobados() {

        int total=0;
        for (Nota nota:notas) {

            if (nota.esAprobada()) total++;

        }
        return total;
    }

}
