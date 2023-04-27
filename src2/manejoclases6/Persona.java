package com.arquitecturajava.manejoclases6;

public class Persona {
    private String nombre;
    private static int contador;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contador++;
    }

    public static int getContador() {
        return contador;
    }

}
