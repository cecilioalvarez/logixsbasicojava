package com.arquitecturajava.manejoclases3;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    private ArrayList<Nota> notas= new ArrayList<Nota>();

    // puede tener el mismo nombre y distintos argumentos
    // sobrecarga de metodos
    public void addNota(Nota nota) {

        notas.add(nota);
    }

    public void addNota(ArrayList<Nota> notas) {
        this.notas.addAll(notas);
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

    public Nota getMejorNota() {

        Nota mayor= new  Nota(0);

        for (Nota nota: notas) {

                if (mayor.getValor()<nota.getValor()) {
                    mayor=nota;
                }
        }
        return mayor;
    }
    public Nota getNotaMedia() {

        double total=0;

        for (Nota nota: notas) {

              total=total+nota.getValor();
        }

        double media=total/notas.size();
        return new Nota(media);
    }
    
}
