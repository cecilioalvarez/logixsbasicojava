package com.arquitecturajava.manejoclases5;

public class Deportista extends Persona {

    public Deportista(String nombre) {
        super(nombre);
     
    }

    @Override
    public void andar() {
        System.out.println("el deportista anda a 7km/hora");
    }
    
}
