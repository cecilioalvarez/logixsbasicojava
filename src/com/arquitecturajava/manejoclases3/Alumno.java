package com.arquitecturajava.manejoclases3;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    private ArrayList<Nota> notas= new ArrayList<Nota>();

    public void addNota(Nota nota) {

        notas.add(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    
}
